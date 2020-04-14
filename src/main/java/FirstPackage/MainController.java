package FirstPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller   //This refers as this is main controller class
@RequestMapping("/main")   //This means request will be mapping on localhost:8081/main 
public class MainController {
	
	@Autowired   //This means Spring will take care of this object creation
	private StudentRepository studentRepository;
	
	@PostMapping(path = "/add")
	public @ResponseBody String addNewStudent(@RequestParam String name, @RequestParam Integer roll_Number, @RequestParam String standerd)
	{
		Student s = new Student();
		s.setName(name);
		s.setRoll_Number(roll_Number);
		s.setStanderd(standerd);
		studentRepository.save(s);
		return "Data Entered";
	}
	
	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Student> getAllStudent()
	{
		
		//this will return JSON/XML values
		System.out.println("Getting Values");
		Iterable<Student> I = studentRepository.findAll();
		System.out.println(I.toString());
		return I;
	}
}

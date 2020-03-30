package FirstPackage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public String Helloworld()
	{
		return "Hi This is First Spring Boot !! EnJoy...:)";
	}
}

package FirstPackage;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import FirstPackage.Student;

//This will be AUTO IMPLEMENTED by Spring into a Bean called StudentRepository
//CRUD refers Create, Read, Update, Delete
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> 
{

}
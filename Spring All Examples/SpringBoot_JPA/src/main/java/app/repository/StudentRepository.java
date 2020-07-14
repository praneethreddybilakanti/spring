package app.repository;
import org.springframework.data.repository.CrudRepository;

import app.entity.Student;  
public interface StudentRepository extends CrudRepository<Student, String>{
	
	
}

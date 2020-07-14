package smlcodes.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface StudentRepository extends MongoRepository<Student, String> { 
	  public Student findBySno(int sno);
	  public Student findByName(String name);
}

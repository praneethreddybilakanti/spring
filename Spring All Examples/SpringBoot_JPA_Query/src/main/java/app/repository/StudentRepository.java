package app.repository;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import app.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{

    List<Student> findBySno(int sno);

    List<Student> findByName(String name);

    //custom query example and return a stream
    @Query("select c from Student c where c.address = :address")
    Stream<Student> findByAddress(@Param("address") String address);
 

}

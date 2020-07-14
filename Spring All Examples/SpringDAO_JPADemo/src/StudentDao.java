
import java.util.List;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.orm.jpa.JpaTemplate;

//File : StudentDao.java
public class StudentDao {
	JpaTemplate template; 
	 
	public void createStudent(int sno,String name,String address){  
        Student student = new Student(sno,name,address);  
        template.persist(student);  
    }  
    public void updateAddress(int sno,String newAddress){  
        Student student = template.find(Student.class, sno);  
        if(student != null){  
            student.setAddress(newAddress);  
        }  
        template.merge(student);  
    }  
    public void deleteStudent(int sno){  
        Student student = template.find(Student.class, sno);  
        if(student != null)  
            template.remove(student);  
    }  
    public List<Student> getAllStudents(){  
        List<Student> students =template.find("select * from Student");  
        return students;  
    }  
}

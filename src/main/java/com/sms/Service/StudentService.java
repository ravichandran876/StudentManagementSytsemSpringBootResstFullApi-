package com.sms.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sms.Entity.Student;
import com.sms.Repository.StudentRepository;
@Service
public class StudentService {

	@Autowired
	private StudentRepository repo;
    
	//Student List Method
     public List<Student> listAll(){
  	  return repo.findAll();
    }
    //Student Save Method
     public void save(Student details) {
  	  repo.save(details);
    }
	//Student Get Method
	public Student get(Long id) {
		return repo.findById(id).get();
	}
	//Student Delete Method
    public void delete(Long id) {
    	repo.deleteById(id);
  }

	
}

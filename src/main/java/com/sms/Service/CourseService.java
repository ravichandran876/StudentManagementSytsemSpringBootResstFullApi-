package com.sms.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sms.Entity.CourseDetails;
import com.sms.Repository.CourseRepository;
@Service
public class CourseService {

	@Autowired
	private CourseRepository repo;
   
	//Course Details list Method
    public List<CourseDetails> listAll(){
  	  return repo.findAll();
    }
   //Course Details Save Method
    public void save(CourseDetails details) {
  	  repo.save(details);
    }
	//Course Details Get Method
	public CourseDetails get(Long id) {
		return repo.findById(id).get();
	}
	//Course Details Delete Method
     public void delete(Long id) {
    	repo.deleteById(id);
     }

     
}

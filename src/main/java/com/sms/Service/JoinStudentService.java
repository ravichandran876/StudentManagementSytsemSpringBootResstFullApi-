package com.sms.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import com.sms.Entity.JoinStudent;
import com.sms.Repository.JoinStudentRepository;
@Service
public class JoinStudentService {

	@Autowired
	private JoinStudentRepository repo;
    
	 //JoinStudent list Method
     public List<JoinStudent> listAll(){
  	   return repo.findAll();
    }
     //JoinStudent Save Method
     public void save(JoinStudent details) {
  	     repo.save(details);
    }
	//JoinStudent Get Method
	 public JoinStudent get(Long id) {
		return repo.findById(id).get();
	}
	 //JoinStudent Delete Method
     public void delete(Long id) {
    	repo.deleteById(id);
       }

}

package com.sms;

import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import com.sms.Entity.JoinStudent;
import com.sms.Repository.JoinStudentRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class JoinStudentRepositoryTest {

	@Autowired
	private JoinStudentRepository  joinstudentRepository;

	 //JoinStudent Set Method Test... 
	@Test
   	@Order(1)
	@Rollback(value = false)
	public void saveJoinStudentTest() throws Exception{
	
		JoinStudent joinstudent=new  JoinStudent(); 
		joinstudent.setCourse_name("C++");
		joinstudent.setStudent_name("Ravi"); 
		joinstudent.setBach_id(6710);
		joinstudent.setEmail("ravi235@gmail.com");
		joinstudent.setCourse_enrollment("J234a45v657a");
		joinstudent.setStudent_enrollment("EGno0123667784");
		
		joinstudentRepository.save(joinstudent);
	Assertions.assertThat(joinstudent.getId()).isGreaterThan(0);
	}

	 //JoinStudent  GetList or FindAll Method Test...
	@Test
	@Order(2)
	public void getListOfJoinStudentTest() throws Exception{
	List<JoinStudent> joinstudent= joinstudentRepository.findAll();
	Assertions.assertThat(joinstudent.size()).isGreaterThan(0);
	}
	 
	 //JoinStudent Update Test...
	@Test
	@Order(3)
	@Rollback(value = false)
	public void updateandJoinStudentTest() throws Exception{
		JoinStudent  joinstudent = joinstudentRepository.findById(1L).get();
	joinstudent.setEmail("karthik235@gmail.com");
	JoinStudent joinstudentUpdated =joinstudentRepository.save(joinstudent);
	Assertions.assertThat(joinstudentUpdated.getEmail()).isEqualTo("karthik235@gmail.com");
	}
     //JoinStudent Delete Test...
	@Test
	@Order(4)
	@Rollback(value = false)
	public void deleteJoinStuedntTest() {
		JoinStudent joinstudent=joinstudentRepository.findById(1L).get();
		joinstudentRepository.delete(joinstudent);
		
		JoinStudent joinstudent1= null;
		Optional<JoinStudent > optionalStudent=
		joinstudentRepository.findByEmail("karthik235@gmail.com");
		if(optionalStudent.isPresent()){
			joinstudent1= optionalStudent.get();
		}

		Assertions.assertThat(joinstudent1).isNull();
		

	}
	}

	


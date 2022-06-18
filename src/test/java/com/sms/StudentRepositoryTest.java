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
import com.sms.Entity.Student;
import com.sms.Repository.StudentRepository;
@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StudentRepositoryTest {

	@Autowired
	private StudentRepository studentRepository;

	//Student Set Method Test...
	@Test
   	@Order(1)
	@Rollback(value = false)
	public void saveStudentTest() throws Exception{
	
		Student student=new  Student(); 
		student.setName("Ravi");
		student.setLastname("Chandran");      
		student.setDono(47);
		student.setAge(22);
		student.setEmail("ravichandraneee1999@gmail.com");
		student.setGender("male");
		student.setDab("1999-05-25");
		student.setFathername("Natarajan");
		student.setMother_name("Rathi");
		student.setCity("Salem,TamilNadu");
		student.setPhonenumber("9080284270");
		student.setPincode(636503);
		student.setStreet("kovilooer");
	              
		studentRepository.save(student);
	Assertions.assertThat(student.getId()).isGreaterThan(0);
	}
	 //Student GetList or FindAll Method Test...
	@Test
	@Order(2)
	public void getListOfStudentTest() throws Exception{
	List<Student> student = studentRepository.findAll();
	Assertions.assertThat(student.size()).isGreaterThan(0);
	}
	//Student Update Test...
	@Test
	@Order(3)
	@Rollback(value = false)
	public void updateandStudentTest() throws Exception{
		Student  student = studentRepository.findById(1L).get();
	student.setEmail("ravi46@gmail.com");
	Student studentUpdated =studentRepository.save(student);
	Assertions.assertThat(studentUpdated.getEmail()).isEqualTo("ravi46@gmail.com");
	}
	//Student Delete Test...
	@Test
	@Order(4)
	@Rollback(value = false)
	public void deleteJoinStuedntTest() {
		Student student=studentRepository.findById(1L).get();
		studentRepository.delete(student);
		
		Student 	student1= null;
		Optional<Student > optionalStudent=
		studentRepository.findByEmail("ram@gmail.com");
		if(optionalStudent.isPresent()){
			student1= optionalStudent.get();
		}

		Assertions.assertThat(student1).isNull();
		
	}
}

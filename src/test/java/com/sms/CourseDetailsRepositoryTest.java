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
import com.sms.Entity.CourseDetails;
import com.sms.Repository.CourseRepository;
@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CourseDetailsRepositoryTest {
		
	@Autowired
	private CourseRepository courseDetailsRepository;
	
     //CourseDetails  Set Method Test... 
	@Test
   	@Order(1)
	@Rollback(value = false)
	public void savCourseDetailsTest() throws Exception{
	
		CourseDetails couresDetails=new  CourseDetails(); 
		
		couresDetails.setCoursename("java");
		couresDetails.setFees_details(2500);
	              
		courseDetailsRepository.save(couresDetails);
	Assertions.assertThat(couresDetails.getId()).isGreaterThan(0);
	}
     //CourseDetails GetList or FindAll Method Test...
	@Test
	@Order(2)
	public void getListOfCourseDetailsTest() throws Exception{
	List<CourseDetails> coursedetails =courseDetailsRepository.findAll();
	Assertions.assertThat(coursedetails.size()).isGreaterThan(0);
	}
	
	  //CourseDetails Update Test...
	@Test
	@Order(3)
	@Rollback(value = false)
	public void updateandCourseDetailsTest() throws Exception{
CourseDetails coursedetails=courseDetailsRepository.findById(1L).get();
	coursedetails.setCoursename("C++");
	CourseDetails coursedetailsUpdated =courseDetailsRepository.save(coursedetails);
	Assertions.assertThat(coursedetailsUpdated.getCoursename()).isEqualTo("C++");
	}
     //CourseDetails Delete Test...
	@Test
	@Order(4)
	@Rollback(value = false)
	public void deleteCourseDetailsTest() throws Exception {
		CourseDetails coursedetails=courseDetailsRepository.findById(1L).get();
		courseDetailsRepository.delete(coursedetails);

		CourseDetails courseDetails1= null;
		Optional<CourseDetails> optionalEmployee=
		courseDetailsRepository.findByCoursename("C++");
		if(optionalEmployee.isPresent()){
			courseDetails1= optionalEmployee.get();
		}

		Assertions.assertThat(courseDetails1).isNull();
		
	
	
	}

}

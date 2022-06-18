package com.sms;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import com.sms.Entity.Userlog;
import com.sms.Repository.UserloginReposirory;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserlongRepositoryTest {

	
	@Autowired
	private UserloginReposirory  userlogRepository;

	@Autowired
	private TestEntityManager entityManager;
	
	 //JoinStudent Set Method Test... 
	@Test
   	@Order(1)
	@Rollback(value = false)
	public void saveJoinStudentTest() throws Exception{
	
	Userlog userlong=new Userlog(); 
	userlong.setEmail("ravi@gmail.com");
	userlong.setPassword("rwege23546");
	userlogRepository.save(userlong);
	Assertions.assertThat(userlong.getId()).isGreaterThan(0);
	}
	
	
	
	@Test
	public void testCreateUser() {
	Userlog user = new Userlog();
	user.setEmail("ravikumar@gmail.com");
	user.setPassword("ravi2020");
	user.setFirstname("ravi");
	user.setLastname("chandran");
	Userlog savedUser = userlogRepository.save(user);
	Userlog existUser = entityManager.find(Userlog.class,
	savedUser.getId());
	assertThat(user.getEmail()).isEqualTo(existUser.getEmail());
	
	}
	
}

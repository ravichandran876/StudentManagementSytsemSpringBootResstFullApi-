package com.sms.Repository;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sms.Entity.JoinStudent;
public interface JoinStudentRepository extends JpaRepository<JoinStudent,Long> {

	Optional<JoinStudent> findByEmail(String string);
	

}

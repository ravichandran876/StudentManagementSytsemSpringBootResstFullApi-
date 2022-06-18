package com.sms.Repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sms.Entity.CourseDetails;

public interface CourseRepository extends JpaRepository<CourseDetails,Long> {

	Optional<CourseDetails> findByCoursename(String string);
	

	
}

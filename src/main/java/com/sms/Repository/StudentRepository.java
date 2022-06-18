package com.sms.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	Optional<Student> findByEmail(String string);

}

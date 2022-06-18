package com.sms.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="joinstudent_details")
public class JoinStudent {
       
	  @Id
      @GeneratedValue(strategy=GenerationType.IDENTITY)
	  private Long id;
     
       @Column(name="student_enrollment")
       private String student_enrollment;
	
      @Column(name="student_name")
	  private String student_name;
	 
      @Column(name="studentemail")
      private String email;
      
      @Column(name="phonenumber")
      private String phonenumer;
      
	  @Column(name="course_name")
	  private String course_name;
	  
	  @Column(name="course_enrollment")
	  private String course_enrollment;
	 
	  @Column(name="bach_id")
	  private int bach_id;
	
	public JoinStudent() {
		super();
	}

	
	
	   public JoinStudent(Long id, String student_enrollment, String student_name, String email, String phonenumer,
			String course_name, String course_enrollment, int bach_id) {
		super();
		this.id = id;
		this.student_enrollment = student_enrollment;
		this.student_name = student_name;
		this.email = email;
		this.phonenumer = phonenumer;
		this.course_name = course_name;
		this.course_enrollment = course_enrollment;
		this.bach_id = bach_id;
	}



	//Getter Setter Method...
	
	public Long getId() {
		return id;
	}

	public String getStudent_enrollment() {
		return student_enrollment;
	}
	
	public void setStudent_enrollment(String student_enrollment) {
		this.student_enrollment = student_enrollment;
	}
	
	public String getStudent_name() {
		return student_name;
	}
	
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	
	public String getCourse_name() {
		return course_name;
	}
	
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	
	public String getCourse_enrollment() {
		return course_enrollment;
	}
	
	public void setCourse_enrollment(String course_enrollment) {
		this.course_enrollment = course_enrollment;
	}
	
	public int getBach_id() {
		return bach_id;
	}
	
	public void setBach_id(int bach_id) {
		this.bach_id = bach_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumer() {
		return phonenumer;
	}

	public void setPhonenumer(String phonenumer) {
		this.phonenumer = phonenumer;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}

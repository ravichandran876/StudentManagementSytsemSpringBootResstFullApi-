package com.sms.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="course_details")
public class CourseDetails {
	
@Id 
@GeneratedValue(strategy=GenerationType.IDENTITY)
	   private Long id;
	   
       @Column(name="course_name")
	   private String coursename;
	   
       @Column(name="course_duration")
	   private String duration ;
	   
       @Column(name="enrollment_number")
	   private String enrollment_number;
	   
       @Column(name="fees_details")
	   private int fees_details;
	   
	   
	public CourseDetails() {
		super();
	}

	public CourseDetails(Long id, String coursename, String duration, String enrollment_number, int fees_details) {
		super();
		this.id = id;
		this.coursename = coursename;
		this.duration = duration;
		this.enrollment_number = enrollment_number;
		this.fees_details = fees_details;
	}
   //Course Details Getter Setter Method...
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCoursename() {
		return coursename;
	}
	
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
	public String getDuration() {
		return duration;
	}
	
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public String getEnrollment_number() {
		return enrollment_number;
	}
	
	public void setEnrollment_number(String enrollment_number) {
		this.enrollment_number = enrollment_number;
	}
	
	public int getFees_details() {
		return fees_details;
	}
	
	public void setFees_details(int fees_details) {
		this.fees_details = fees_details;
	}
	
	
	
	
}

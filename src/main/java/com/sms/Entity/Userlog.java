package com.sms.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userlogin")
public class Userlog {
	
	@Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long id;
	
	 @Column(name="email")
	 private String email;

	 @Column(name="password")
	private String password;
	
	 @Column(name="first_name")
	 private String firstname;
	 
	 
	 @Column(name="last_name")
	 private String lastname;
	 
	 
	 public Userlog() {
		super();
	
	}

	public Userlog(Long id, String email, String password, String firstname, String lastname) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(Object object) {
		this.password = (String) object;
	}

	public void setUserlogService(Object userlogService) {
		

	}
	 
	 
	
	
}

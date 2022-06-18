package com.sms.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="studentdetails")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="first_name")
	private String Name;
	
	@Column(name="last_name")
	private String lastname; 
	
	@Column(name="email")
	private String email;
	
	@Column(name="age")
    private int age;	
	
	@Column(name="date_of_birth")
 	private String dab;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="phone_number")
	private String  phonenumber;
	
	@Column(name="father_name")	
	private String fathername;
	
	@Column(name="mothername")
	private String mother_name; 
	
	@Column(name="dono")
	private int dono;
	
	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;
	
	@Column(name="pincode")
	private int pincode;

	public Student() {
		super();
	}

	public Student(Long id, String name, String lastname, String email, int age, String dab, String gender,
			String phonenumber, String fathername, String mother_name, int dono, String street, String city,
			int pincode) {
		super();
		this.id = id;
		Name = name;
		this.lastname = lastname;
		this.email = email;
		this.age = age;
		this.dab = dab;
		this.gender = gender;
		this.phonenumber = phonenumber;
		this.fathername = fathername;
		this.mother_name = mother_name;
		this.dono = dono;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}

//Getter Setter Method...
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDab() {
		return dab;
	}

	public void setDab(String dab) {
		this.dab = dab;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getMother_name() {
		return mother_name;
	}

	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}

	public int getDono() {
		return dono;
	}

	public void setDono(int dono) {
		this.dono = dono;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}

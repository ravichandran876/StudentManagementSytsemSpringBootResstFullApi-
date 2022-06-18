package com.sms.Controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AppController {

	
	
	@RequestMapping("/")
	 public String viewHomeet() {
		return "userlog"; 
	}
	@RequestMapping("/homepage")
	public String Nextpage() {
		return "afirstindexhtml";
	 }
}

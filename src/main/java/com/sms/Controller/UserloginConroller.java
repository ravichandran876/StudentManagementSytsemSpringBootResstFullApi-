package com.sms.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.sms.Entity.Userlog;
import com.sms.Service.UserloginService;

@Controller
public class UserloginConroller {

	 @Autowired
	 private UserloginService service;
	 
	 @RequestMapping("/userlonginpage")
		public String shownewstudent(Model model) throws Exception {
			Userlog student=new Userlog ();
			model.addAttribute("adduserlong", student);
			return "userlonginpage";
		}
		
		@RequestMapping(value="/saveuser",method=RequestMethod.POST)
		public String saveStudent(@ModelAttribute("student") Userlog student) throws Exception {
		service.save(student);
			return "afirstindexhtml";
		}
	
	
}

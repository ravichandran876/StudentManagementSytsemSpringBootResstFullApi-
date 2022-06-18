package com.sms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sms.Entity.JoinStudent;
import com.sms.Service.JoinStudentService;


@Controller
public class JoinStudentController {

	@Autowired
	private JoinStudentService service;
	
	 @RequestMapping("/joinsatudentdetails")
		public String viewmarckpage(Model model) {
			List<JoinStudent> marck=service.listAll();
			model.addAttribute("listmark",marck);
			return "joinstudentindex";
			
		}
	
	 @RequestMapping("/addmarks")
		public String shownewstudent(Model model) {
		 JoinStudent student=new JoinStudent();
			model.addAttribute("addjoinstudent", student);
			return "joinnewstudentadd";
		}
	   @RequestMapping(value="/savejoinstudent",method=RequestMethod.POST)
		public String saveMarks(@ModelAttribute("studetn") JoinStudent mark) {
		service.save(mark);
			return "redirect:/joinsatudentdetails";
		}
		@RequestMapping("/editm/{id}")
		public ModelAndView showEditstudent(@PathVariable(name="id") Long id) {
			ModelAndView mav=new ModelAndView("joinstudentedit");
				JoinStudent student=service.get(id);
	         mav.addObject("student", student);
			return mav;
		}
	
		@RequestMapping("/deletem/{id}")
		public String deleteMarks(@PathVariable(name="id")Long id) {
			service.delete(id);
			return "redirect:/joinsatudentdetails";
		}
		
		
		@RequestMapping(value="/newjoin",method=RequestMethod.POST)
		public String savejoinnew(@ModelAttribute("studetn") JoinStudent mark) {
		service.save(mark);
			return "redirect:/cuser";
		}
		
		
		 @RequestMapping("/addjoin")
			public String shownewstudent1(Model model) {
			 JoinStudent student=new JoinStudent();
				model.addAttribute("addma", student);
				return "newjoin";
			}
		
		
}

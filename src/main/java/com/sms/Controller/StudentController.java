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
import com.sms.Entity.Student;
import com.sms.Service.StudentService;

@Controller
public class StudentController {
     
	@Autowired
	private StudentService service;


	@RequestMapping("/getstudent")
	public String viewHomepage(Model model) throws Exception{	
		List<Student> student=service.listAll();
		model.addAttribute("liststudet",student);
		return "studentindex";		 
	}

	@RequestMapping("/addstudent")
	public String shownewstudent(Model model) throws Exception {
		Student student=new Student();
		model.addAttribute("addstudent", student);
		return "studentadd";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveStudent(@ModelAttribute("student") Student student) {
	service.save(student);
		return "redirect:/getstudent";
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView showEditstudent(@PathVariable(name="id") Long id) throws Exception {
		ModelAndView mav=new ModelAndView("studentedit");
			Student student=service.get(id);
         mav.addObject("student", student);
		return mav;
	}

	@RequestMapping("/delete/{id}")
	public String deleteStudent(@PathVariable(name="id")Long id) throws Exception{
		service.delete(id);
		return "redirect:/getstudent";
	}
	
	
}

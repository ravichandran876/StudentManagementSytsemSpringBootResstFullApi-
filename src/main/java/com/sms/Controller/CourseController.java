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
import com.sms.Entity.CourseDetails;
import com.sms.Service.CourseService;

@Controller
public class CourseController {

	@Autowired	
    private CourseService service;
   	 
	   @RequestMapping("/addclassdetails")
		public String viewaddresspage(Model model) {
			List<CourseDetails> details=service.listAll();
			model.addAttribute("listclass",details);
			return "courseindex";
			
		}
	   @RequestMapping("/adddetails")
		public String shownewstudent(Model model) {
		   CourseDetails  details=new CourseDetails();
			model.addAttribute("addclass", details);
			return "courseadd";
		}
		@RequestMapping(value="/saveclass",method=RequestMethod.POST)
		public String saveClassDetails(@ModelAttribute("addclass") CourseDetails details ) {
		service.save(details);
			return "redirect:/addclassdetails";
		}
		
		@RequestMapping("/editclass/{id}")
		public ModelAndView showEditClassDetails(@PathVariable(name="id") Long id) {
			ModelAndView mav=new ModelAndView("courseedit");
			CourseDetails details=service.get(id);
	         mav.addObject("address", details);
			return mav;
		}
		
	
		@RequestMapping("/deleteclass/{id}")
		public String deleteaddress(@PathVariable(name="id")Long id) {
			service.delete(id);
			return "redirect:/addclassdetails";
		}
		
		
		  @RequestMapping("/cuser")
			public String viewaddresspage1(Model model) {
				List<CourseDetails> details=service.listAll();
				model.addAttribute("listclass",details);
				return "user";
				
			}

		

			

}

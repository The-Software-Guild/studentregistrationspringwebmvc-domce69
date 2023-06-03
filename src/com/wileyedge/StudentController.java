package com.wileyedge;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wileyedge.service.StudentIService;

@Controller
public class StudentController {
	@Autowired
	private StudentIService service;
	
	@Autowired
	@Qualifier(value = "stuVal")
	private Validator validator;
	//http://localhost:8080/SpringWebMvc/saveemp.htm
	@RequestMapping(value = "/savestu.htm", method = RequestMethod.GET)
	public String showEmpForm(Map<String, Student> map) {
		System.out.println("Inside showStuform of StudentController");
		map.put("s", new Student());
		return "stuform";
	}
	
	//http://localhost:8080/StudentRegistrationMVC/savestu.htm
	@RequestMapping(value = "/savestu.htm", method = RequestMethod.POST)
	//public String persistEmployee(@RequestParam("eid") Integer id, String fname, String lname, Map<String, Employee> map) {
	/*public String persistEmployee(@ModelAttribute("e") Employee e, Map<String, Employee> map) {	*/
	public String persistStudent(@ModelAttribute("s") Student s, Map<String, Student> map, BindingResult result) {		
		System.out.println("Inside persistEmployee() of EmployeeController");
		map.put("s", s);
		System.out.println("Invoking service layer");
		//System.out.println("ID: " + e.getEid() + ", First Name: " + e.getFname() + ", Last Name: " + e.getLname());
		List<Student> stu = new ArrayList<>();
		stu.add(s);
		
		//EmployeeValidator empVal = new EmployeeValidator();
		validator.validate(s, result);
		
		if(result.hasErrors()) {
			return "stuform";
		}
		
		service.saveStud(s);
		return "success";
	}
	
}

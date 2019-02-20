package com.spring.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.model.Student;





public class LoginController 
{
	
		 @RequestMapping(value = "/", method = RequestMethod.GET)
		    public String viewLogin(Map<String, Object> model) 
		 {
		        Student stud = new Student();
		        model.put("StudentForm",stud);
		        return "Registration";
	     }
		 
		    @RequestMapping(value = "/student", method = RequestMethod.POST)
		    public String doLogin(@Valid @ModelAttribute("StudentForm") Student stud,BindingResult result/* Map<String, Object> model*/) 
		    {
		 
		        if (result.hasErrors()) 
		        {
		            return "Registration";
		        }
		        
		       String name= stud.getStudentName();
		       String add= stud.getStudentAddress();
		        
		       System.out.println(name);
		       System.out.println(add);
		        
		 
		        return "RegistrationSuccess";
		    }

}

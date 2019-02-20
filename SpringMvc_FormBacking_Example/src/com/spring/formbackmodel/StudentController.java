package com.spring.formbackmodel;
import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller


public class StudentController 
{

	    @RequestMapping(value="/",method = RequestMethod.GET)
	    public String Registration(Map<String, Object> model) 
	    {
	    	Student stud=new Student();
	    	model.put("StudentForm",stud );
	         
	        ArrayList<String> catogeryList = new ArrayList<String>();
	        catogeryList.add("Medical Sudent");
	        catogeryList.add("Engineer Student");
	        catogeryList.add("Aeronatical student");
	        model.put("StudentList", catogeryList);
	        
	        
	        System.out.println("hai");
	        
	        
	        return "Registration";
	         
	         
	         
	       
	    }
	     
	    
	    @RequestMapping(value="/student",method = RequestMethod.POST)
	    public String viewRegistration(@ModelAttribute("StudentForm")Student stud,BindingResult result, Map<String, Object> model) 
	    {
	    	
	    	
	    	
	    	 System.out.println(stud.getStudentName()+" "+stud.getStudentAddress());
	    	

	    	
	    	 return "RegistrationSuccess";
	    }
	    
	    /*
	    @RequestMapping(value="/studregsuccess",method = RequestMethod.POST)
	    public String processRegistration(@ModelAttribute("StudentForm") Student stud,BindingResult result,
	            Map<String, Object> model) {
	         
	        // implement your own registration logic here...
	         
	        // for testing purpose:
        System.out.println("Student ID" +stud.getStudentId()  );
	    System.out.println("Student Name"+stud.getStudentName());
	    System.out.println("Student Address"+stud.getStudentAddress());
	       
	        return "RegistrationSuccess";
	    }
	    */
	}



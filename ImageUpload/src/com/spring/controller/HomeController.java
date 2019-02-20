package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shibernate.dao.DAO;
import com.shibernate.dao.DAOImpl;
import com.spring.beans.SignUpForm;

@Controller
public class HomeController 
{
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home(Model model)
	{
		SignUpForm signUpForm=new SignUpForm();
		model.addAttribute("uploadImage",signUpForm);
			
		
		return "home";
	}
	
	@RequestMapping(value="/uploadImage",method=RequestMethod.POST)
	public String uploadImage(@ModelAttribute("uploadImage")SignUpForm signUpForm,Model model)
	{
		
		DAO dao=new DAOImpl();
		
		
		dao.insert(signUpForm);
		
		model.addAttribute("uploadImage",signUpForm);
			
		
		return "uploadedSuccess";
	}

}

package com.nbos.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nbos.forms.LoginForm;
import com.nbos.service.LoginService;
import com.nbos.service.LoginServiceImpl;

@Controller
public class LoginController 
{
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView homePage()
	{
		return new ModelAndView("login","LFBO",new LoginForm());
	}
	
	@RequestMapping(value="loginPage",method=RequestMethod.POST)
	public ModelAndView loginPage(@Valid@ModelAttribute("LFBO")LoginForm loginForm,BindingResult result)
	{
		
		if(result.hasErrors())
		{
			return new ModelAndView("login");
		}
		else
		{		
			
			LoginService service=new LoginServiceImpl();
			
			String modelAndView= service.checkLoginDetails(loginForm);
					
			return new ModelAndView(modelAndView);
		}
		
		
	}

}

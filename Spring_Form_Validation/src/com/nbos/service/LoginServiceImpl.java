package com.nbos.service;

import java.util.Iterator;
import java.util.List;

import com.nbos.dao.LoginDAO;
import com.nbos.dao.LoginDAOFactory;
import com.nbos.forms.LoginForm;
import com.nbos.model.Login;
import com.nbos.util.InstanceUtils;

public class LoginServiceImpl implements LoginService 
{

	@Override
	public String checkLoginDetails(LoginForm loginForm) 
	{

		
		Login login=InstanceUtils.getLoginInstance();
		
		LoginDAO dao=LoginDAOFactory.getLoginDAOImplInstance();
		
				
		List list=dao.getLoginDetails(loginForm);
				 
		Iterator it=list.iterator();
		 
		 while(it.hasNext())
		 {
			 login=(Login)it.next();
			 
		 }
	 
		
	
		if(loginForm.getUname().equals(login.getUserName())&&loginForm.getPwd().equals(login.getPassword()))
		{
				
				
				
			return "success";
		}
		else
		{
				
				
			return "failure";
		}
		
      
	}

}

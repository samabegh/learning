package com.nbos.dao;



import java.util.List;

import com.nbos.forms.LoginForm;

public interface LoginDAO 
{
	
	List getLoginDetails(LoginForm loginForm);

}

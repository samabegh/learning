package com.nbos.dao;

public class LoginDAOFactory 
{
	
	public static LoginDAO getLoginDAOImplInstance()
	{
		return new LoginDAOImpl();
	}

}

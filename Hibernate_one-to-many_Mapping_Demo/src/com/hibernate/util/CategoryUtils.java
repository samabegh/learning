package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CategoryUtils 
{
	private static SessionFactory factory;
	private CategoryUtils()
	{
		
	}
	public static SessionFactory getSessionFactory()
	{
	if(factory==null)
	{
		factory=new Configuration().configure("com/salma/config/hibernate.cfg.xml").buildSessionFactory();
		
	}
	return factory;
	}

}

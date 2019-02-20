package com.hibernate.dao;

public class CategoryFactory 
{
	private static CategoryDAO getInstance()
	{
		return new CategoryDAOImpl();
	}

}

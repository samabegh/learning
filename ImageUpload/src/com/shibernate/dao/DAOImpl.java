package com.shibernate.dao;



import java.io.File;
import java.io.FileInputStream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.SignUp;
import com.spring.beans.SignUpForm;

public class DAOImpl implements DAO
{

	@Override
	public void insert(SignUpForm signUpForm)
	{
		SessionFactory factroy=new Configuration().configure("com/hibernate/config/hibernate.cfg.xml").buildSessionFactory();
		Session session=factroy.openSession();
		
		SignUp signUp=new SignUp();
		
		
		
		try
		{
			File file=new File("E:/Photos/Kiran/DSC_0399.JPG");
			byte[] imageData = new byte[(int) file.length()]; 
			FileInputStream fileInputStream = new FileInputStream(file); 
			fileInputStream.read(imageData); 
			fileInputStream.close();
			
			session.beginTransaction();
			
			signUp.setId(signUpForm.getId());
			signUp.setProfilePic(imageData);
			session.save(signUp);
			
			session.getTransaction().commit();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}
	

}

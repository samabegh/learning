package com.hibernate.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bean.model.CategoryBean;
import com.bean.model.ProductBean;
import com.hibernate.util.CategoryUtils;
import com.salma.model.Category;
import com.salma.model.Product;

public class CategoryDAOImpl implements CategoryDAO 
{

	SessionFactory factory;
	public void addCategory(CategoryBean catt) 
	{
		
		
		System.out.println("addproduct");
		factory=CategoryUtils.getSessionFactory();
		
		Session session=factory.openSession();
		
		Category category=new Category();
		
		category.setCatId(catt.getCatId());
		category.setCatName(catt.getCatName());
		
		Transaction tx=session.beginTransaction();
		
		session.save(category);
		
		
		tx.commit();
		session.close();
	}

	
	public void addProduct(ProductBean product) 
	{
		factory=CategoryUtils.getSessionFactory();
		Session session=factory.openSession();
		
		Product prod=new Product();
		prod.setProductId(product.getProd_id());
		prod.setPrice(product.getProd_price());
		prod.setProductName(product.getProd_Name());
				
		Category category=(Category)session.load(Category.class,product.getCatId());
		
		List<Product>list=category.getProduct();
				
		list.add(prod);
		
		Transaction tx=session.beginTransaction();
				
		category.setProduct(list);
		
		tx.commit();
		session.close();
		
		
	}

	
	

	
}

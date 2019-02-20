package com.hibernate.dao;

import com.bean.model.CategoryBean;
import com.bean.model.ProductBean;

public interface CategoryDAO 
{
	void addCategory(CategoryBean categoryBean);
	void addProduct(ProductBean product);
	
	

}

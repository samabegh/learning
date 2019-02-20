package com.bean.model;

import org.hibernate.validator.constraints.NotEmpty;

public class CategoryBean 
{
	private int catId;
	@NotEmpty(message="Invalid category name-name should not be null")
	private String catName;
	
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getCatName() 
	{
		return catName;
	}
	public void setCatName(String catName) 
	{
		this.catName = catName;
	}
	
	

}

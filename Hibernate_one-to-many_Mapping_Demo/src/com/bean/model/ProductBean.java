package com.bean.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class ProductBean 
{
	private int catId;
	
	private int prod_id;
	
	@NotEmpty(message="name should not be null")
	private String prod_Name;
	@NotNull(message="price should not be null")
	private long prod_price;
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public int getProd_id() {
		return prod_id;
	}
	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}
	public String getProd_Name() {
		return prod_Name;
	}
	public void setProd_Name(String prod_Name) {
		this.prod_Name = prod_Name;
	}
	public long getProd_price() {
		return prod_price;
	}
	public void setProd_price(long prod_price) {
		this.prod_price = prod_price;
	}
	
	

}

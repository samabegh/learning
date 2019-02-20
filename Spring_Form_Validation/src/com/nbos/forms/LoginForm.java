package com.nbos.forms;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginForm 
{
	@NotEmpty(message="User Name should Not emplty")
	@Size(min=4,max=8,message="User name must 4 to 8 letters")
	private String uname;
	@NotEmpty
	private String pwd;
	public String getUname() 
	{
		return uname;
	}
	public void setUname(String uname) 
	{
		this.uname = uname;
	}
	public String getPwd() 
	{
		return pwd;
	}
	public void setPwd(String pwd) 
	{
		this.pwd = pwd;
	}
	
	
	
	

}

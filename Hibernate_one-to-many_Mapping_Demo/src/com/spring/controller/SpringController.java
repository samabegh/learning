package com.spring.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.model.CategoryBean;
import com.bean.model.ProductBean;
import com.hibernate.dao.CategoryDAO;
import com.hibernate.dao.CategoryDAOImpl;
@Controller
public class SpringController 
{
	 @RequestMapping(value ="/", method=RequestMethod.GET)
	    public String Category(Map<String, Object> model) 
	 {
	      
		   CategoryBean  cat=new CategoryBean();
	        model.put("catForm",cat);
	        
	        return "Category";
	    }
	 
	    @RequestMapping(value ="/category", method=RequestMethod.POST)
	    public String Categorycheck(@Valid@ModelAttribute("catForm") CategoryBean categoryBean,BindingResult result) 
	    {
	 
	        if (result.hasErrors()) 
	        {
	            return "Category";
	        }
	        
	        
	       
	        CategoryDAO dao=new CategoryDAOImpl();
	        System.out.println("controller");
	        dao.addCategory(categoryBean);
	       
	 
	        return "Success";
	    }
	   /*---------- product controller*--------------------------------------*/
	    
	    
	    
	    @RequestMapping(value ="/product", method=RequestMethod.GET)
	    public String product(Map<String,Object> model)
	    {
	    	ProductBean p =new ProductBean();
	    	model.put("prodForm", p);
	    	
	    	return "Product";
	    	
	    }
	    @RequestMapping(value="/productchk",method=RequestMethod.POST)
	    public String ProductCheck(@Valid@ModelAttribute("prodForm") ProductBean produtBean,BindingResult result)
	    {
	    	if(result.hasErrors())
	    	{
	    		return "product";
	    	}
	    	 CategoryDAO dao=new CategoryDAOImpl();
	    	 dao.addProduct(produtBean);
	    	
	    	return "productSuccess";
	    }
	    
	    
	
}

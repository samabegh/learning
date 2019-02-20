package com.nbos.dao;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.nbos.forms.LoginForm;
import com.nbos.model.Login;
import com.nbos.util.InstanceUtils;

public class LoginDAOImpl implements LoginDAO 
{
	
	SessionFactory factory;
	
	@Override
	public List getLoginDetails(LoginForm loginForm)
	{
		Login login=InstanceUtils.getLoginInstance();
		
	    factory=InstanceUtils.getSessionFactoryInstance();
	    
	    Session session=factory.openSession();
	    
	    String user=loginForm.getUname();
	    String pwd=loginForm.getPwd();

	    Criteria crit=session.createCriteria(Login.class);
	    
	    Criterion c1=Restrictions.eq("userName",user);
	    Criterion c2=Restrictions.eq("password",pwd);
	    
	    Criterion c3=Restrictions.and(c1,c2);
	    
	    crit.add(c3);
	 
	    List list=crit.list();
	    
		    
	    return list;
		
		
	}

}

package com.mvntest.app;

import java.util.Date;
import java.util.UUID;

import org.hibernate.Session;

import com.mvntest.user.DBUser;
import com.mvntest.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//App obj = new App();
        //System.out.println( "Unique ID: " + obj.generateUniqueKey() );
    	
    	System.out.println("Maven + Hibernate + MySQL (with annotation)");
    	Session session = HibernateUtil.getSessionFactory().openSession();
    	
    	session.beginTransaction();
    	DBUser user = new DBUser();
    	
    	user.setUserId(11);
    	user.setUsername("xman");
    	user.setCreatedBy("system");
    	user.setCreatedDate(new Date());
    	
    	session.save(user);
    	session.getTransaction().commit();
    	
    }
    
    public String generateUniqueKey() {
    	
    	String id = UUID.randomUUID().toString();
    	return id;
    }
}

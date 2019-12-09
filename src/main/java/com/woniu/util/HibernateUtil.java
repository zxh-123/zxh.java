package com.woniu.util;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	static ThreadLocal<Session> local = new ThreadLocal<Session>();
    static SessionFactory factory;
    static {
    	Configuration con =new Configuration().configure("hibernate.cfg.xml");
    	factory = con.buildSessionFactory();
    }
    public static Session getSession() {
    	Session session= local.get();
    	if(session==null) {
    		session = factory.openSession();
    		local.set(session);
    	}
    	return session;
    }
    
    public static void closeSession() {
    	Session session = local.get();
    	if(session!=null) {
    		session.close();
    		local.set(null);
    	}
    }
}

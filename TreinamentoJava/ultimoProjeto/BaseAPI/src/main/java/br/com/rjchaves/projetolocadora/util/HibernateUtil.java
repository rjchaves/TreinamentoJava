package br.com.rjchaves.projetolocadora.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	
	
	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;

	public static SessionFactory getSessionFactory()  {
	
        if(sessionFactory == null) {  
        	Configuration configuration = new Configuration();
        	configuration.configure("hibernate.cfg.xml");
        	serviceRegistry = new ServiceRegistryBuilder().applySettings(
					configuration.getProperties()).buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);  
            sessionFactory.openSession();
        }   

        return sessionFactory;    
    }   
	
	public static Session getSession()    
    {    
    	return getSessionFactory().getCurrentSession();    
    }    
}

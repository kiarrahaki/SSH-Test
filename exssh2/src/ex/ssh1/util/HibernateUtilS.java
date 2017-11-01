package ex.ssh1.util;

import org.hibernate.classic.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HibernateUtilS {
	private static Configuration configuration;
	private static SessionFactory sessionFactory; 
	static{
		//sessionFactory只能被创建一次，那么就在hibernateUtils中去创建
		configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
	}
	
	public static Session getSession(){
		return sessionFactory.openSession();
	}
	
	public static void close(){
		sessionFactory.close();
	}
	
}

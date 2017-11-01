package ex.ssh1.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ex.ssh1.util.HibernateUtilS;

@SuppressWarnings("all")
public class HibernateTest {
	public static void main(String[] args) {
		demo11();
		
				
	}
	
	
	public static void demo11(){

		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
		sessionFactory.close();
	}
	
}

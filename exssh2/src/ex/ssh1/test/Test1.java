package ex.ssh1.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import ex.ssh1.util.HibernateSessionFactory;


public class Test1 {

	public static void main(String[] args) {

		Session session = HibernateSessionFactory.getSession();
		
		Transaction transaction = session.beginTransaction();
		
		
		transaction.commit();
		
		
		HibernateSessionFactory.closeSession();
		
	}

}

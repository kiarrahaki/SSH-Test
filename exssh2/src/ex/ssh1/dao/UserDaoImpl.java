package ex.ssh1.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import ex.ssh1.entity.User;

public class UserDaoImpl implements UserDao {

	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void add(){
		System.out.println("userDaoImpl..........");
		User user = new User();
		user.setUsername("zhangsan");
		user.setPassword("123456");
		
		hibernateTemplate.save(user);
	}
	
}

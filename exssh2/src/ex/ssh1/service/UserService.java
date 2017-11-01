package ex.ssh1.service;

import org.springframework.transaction.annotation.Transactional;

import ex.ssh1.dao.UserDao;
import ex.ssh1.dao.UserDaoImpl;

@Transactional
public class UserService {

	private UserDao userDao;

	public void setUserDao(UserDaoImpl userDaoImpl) {
		this.userDao = userDaoImpl;
	}

	public void add() {
		System.out.println("userService..........");
		userDao.add();
	}
	
	
}

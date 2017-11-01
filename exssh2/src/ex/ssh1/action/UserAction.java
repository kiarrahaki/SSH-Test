package ex.ssh1.action;

import com.opensymphony.xwork2.ActionSupport;

import ex.ssh1.service.UserService;

@SuppressWarnings("serial")
public class UserAction extends ActionSupport {

	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	@Override
	public String execute() throws Exception {
		System.out.println("action.........");
		userService.add();
		return NONE;
	}
	
	
	
}

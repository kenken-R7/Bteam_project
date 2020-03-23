package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.dao.UserDAO;

public class LoginLogic {
	private String id;
	private String password;

	public LoginLogic(String id,String password) {
		this.id=id;
		this.password=password;
	}

	public boolean execute() throws ClassNotFoundException, SQLException{

		UserDAO dao = new UserDAO();


		List<UserBean> user=new ArrayList<UserBean>();
			user=dao.selectAllUsers();
		for(UserBean a:user) {
		if(user!=null&&id.equals(a.getId())&&password.equals(a.getPassword())) {return true;}
		}
		return false;
	}
}
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.dao.UserBean;


public class UserDAO  {
	
public List<UserBean> userList() throws SQLException,ClassNotFoundException{
	try(Connection con=ConnectionManager.getConnection()){
		List<UserBean> userList=new ArrayList<>();
		String sql="SELECT * FROM accounttable";
		PreparedStatement pStmt=con.prepareStatement(sql);
		List<UserBean> userlist=new ArrayList<>();
		ResultSet re=pStmt.executeQuery();
		while(re.next()) {
			String id=re.getString("ID");
			String pass=re.getString("PASSWORD");
			String name=re.getString("NAME");
			int lavel=re.getInt("LEVEL");
			UserBean user=new UserBean(id,pass,name,lavel);
			userList.add(user);
			}
		return userList;
	}
}

	
	//ログイン処理メソッド
	public boolean loginCheck(String id,String pass) throws SQLException,ClassNotFoundException{
		try (Connection con=ConnectionManager.getConnection()){
			List<UserBean> list=new ArrayList<>();
			list=userList();
			
			for(UserBean user1:list) {
				if(user1.getId().equals(id)&&user1.getPassWord().equals(pass)) {
					return true;
				}
				
			
			}
			
			
		}
		return false;
		}
	}










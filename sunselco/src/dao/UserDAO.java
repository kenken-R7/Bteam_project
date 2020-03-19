package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.dao.UserBean;


public class UserDAO  {

	
	//ログイン処理メソッド
	public boolean loginCheck(String id,String pass) throws SQLException,ClassNotFoundException{
		try (Connection con=ConnectionManager.getConnection()){
			String sql="SELECT * FROM accounttable";
			PreparedStatement pStmt=con.prepareStatement(sql);
			List<UserBean> userlist=new ArrayList<>();
			ResultSet re=pStmt.executeQuery();
			while(re.next()) {
				UserBean user=new UserBean();
				user.setId(re.getString(1));
				user.setName(re.getString(3));
				user.setPassWord(re.getString(2));
				user.setLevel(re.getInt(4));
				userlist.add(user);
				}
			
			for(UserBean user1:userlist) {
				if(user1.getId().equals(id)&&user1.getPassWord().equals(pass)) {
					return true;
				}else {
					return false;
				}
			
			}
			return false;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			  re.close();
			  pStmt.close();
			  con.close();
		return false;
		
		}
	}








}

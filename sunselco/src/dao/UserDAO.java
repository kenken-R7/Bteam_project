package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class UserDAO  {

	public boolean loginCheck(String id,String pass) throws SQLException,ClassNotFoundException{
		try (Connection con=ConnectionManager.getConnection()){
			String sql="SELECT * FROM accounttable WHERE id=? AND password=?";
			PreparedStatement pStmt=con.prepareStatement(sql);
			pStmt.setString(1, id);
			pStmt.setString(2, pass);
			
			ResultSet re=pStmt.executeQuery();
			if(re.next()) {
				return true;
			}else {
				return false;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		
	}








}

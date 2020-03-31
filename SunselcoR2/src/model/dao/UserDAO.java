package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.UserBean;

public class UserDAO {

	private UserBean user=new UserBean();
	//テーブル内の情報をリストに取得されるメソッド
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
					if(user1.getId().equals(id)&&user1.getPassword().equals(pass)) {
						this.user=user1;
						return true;

					}


				}


			}
			return false;
			}
public void accountMake(String id,String password,String name) throws SQLException,ClassNotFoundException {
	try(Connection con=ConnectionManager.getConnection()){
		con.setAutoCommit(false);
		String sql="INSERT INTO accounttable(id,password,name) VALUES(?,?,?)";
		PreparedStatement pStmt=con.prepareStatement(sql);
		pStmt.setString(1, id);
		pStmt.setString(2, password);
		pStmt.setString(3, name);
		pStmt.executeUpdate();
		con.commit();
		con.setAutoCommit(true);
	}

}
public UserBean sendUser() {
	return this.user;
}
//public void changeAcount(String id,String password,String name) throws SQLException,ClassNotFoundException {
//	UserBean user=new UserBean();
// dao=new UserDAO();
//	user=dao.sendUser();
//	try(Connection con=ConnectionManager.getConnection()){
//	String sql="UPDATE accounttable SET id=?,password=?,name=? WHERE id=?;";
//	PreparedStatement pStmt=con.prepareStatement(sql);
//	pStmt.setString(1, id);
//	pStmt.setString(2, password);
//	pStmt.setString(3, name);
//	pStmt.setString(4, user.getId());
//	pStmt.executeUpdate();
//	con.commit();
//	con.setAutoCommit(true);
//}
//}

	public boolean accountChange(String id_ch,String password_ch,String name_ch,String seachId) throws ClassNotFoundException, SQLException{

		//SQLの指定
		String sql = "UPDATE accounttable SET id = ?,password = ?,name = ? WHERE id = ?";

		// データベースへの接続の取得、Statementの取得、SQLステートメントの実行
		try(Connection con = ConnectionManager.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);){

				// 結果の操作
				pstmt.setString(1,id_ch);
				pstmt.setString(2,password_ch);
				pstmt.setString(3, name_ch);
				pstmt.setString(4, seachId);
				int r = pstmt.executeUpdate();

				//DBを閉じる
				pstmt.close();

				if(r != 0) {
					return true;
				}

			}

		return false;

	}

	public boolean accountDelete(String seachId) throws ClassNotFoundException, SQLException{

		//SQLの指定
		String sql = "DELETE FROM accounttable WHERE id = ?";

		// データベースへの接続の取得、Statementの取得、SQLステートメントの実行
		try(Connection con = ConnectionManager.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);){

				// 結果の操作
				pstmt.setString(1, seachId);
				int r = pstmt.executeUpdate();

				//DBを閉じる
				pstmt.close();

				if(r != 0) {
					return true;
				}

			}

		return false;

	}

}



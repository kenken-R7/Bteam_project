package model.dao;

/*
 * WebApp_t-ex01
 * model.dao.ConnectionManager.java
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * コネクションマネージャ
 * @author emBex Education
 */
public class ConnectionManager {

	/**
	 * データベースURL
	 */
	private final static String URL = "jdbc:mysql://localhost:3306/sunselco?useSSL=false";

	/**
	 * ユーザ
	 */
	private final static String USER = "postgres";

	/**
	 * パスワード
	 */
	private final static String PASSWORD = "password";

	/**
	 * データベースへの接続を取得して返します。
	 *
	 * @return コネクション
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static Connection getConnection() throws SQLException, ClassNotFoundException {

		// JDBCドライバの読み込み
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection(URL, USER, PASSWORD);

	}
}
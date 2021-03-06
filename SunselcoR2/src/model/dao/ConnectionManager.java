package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	private final static String URL = "jdbc:postgresql://localhost:5432/sunselco";

	private final static String USER = "postgres";

	private final static String PASSWORD = "password";

	public static Connection getConnection() throws SQLException, ClassNotFoundException {

		// JDBCドライバの読み込み
		try {
		Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		return DriverManager.getConnection(URL, USER, PASSWORD);

	}
}



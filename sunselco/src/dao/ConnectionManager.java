package dao;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionManager {

	
	private final static String URL = "jdbc:postgresql://localhost:5432/sunselco";

	
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
		Class.forName("org.postgresql.Driver");
		return DriverManager.getConnection(URL, USER, PASSWORD);

	}
}
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Nutter;


public class MutterDAO {

	private final String JDBC_URL="jdbc:h2:tcp://localhost/~/docotsubu";
	private final String DB_USER="sa";
	private final String DB_PASS
}

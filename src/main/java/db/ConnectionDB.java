package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
	public static Connection loadDatabase() {
		Connection cn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jee_db","root","");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cn;	
	}
}

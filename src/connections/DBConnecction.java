package connections;

import java.sql.*;

public class DBConnecction {

	public static Connection getConn() throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "password"); 
				return con;
		

	}

}

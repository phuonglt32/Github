package phuong.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
	
	private static Connection connection = null;
	private static Statement stmt = null;
	
	
	public static Statement getconnect(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager
		    		.getConnection("jdbc:mysql://localhost:3306/chess_tournament","root", "");
			stmt = connection.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stmt;
	}
}

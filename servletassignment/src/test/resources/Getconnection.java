package JDBC;
import java.util.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Getconnection {
	String dbURL = "jdbc:mysql://localhost:3306/bookstore";
	String username = "Ananya30";
	String password = "root";
	{
	 
	try {
	 
	    java.lang.String password = null;
		Connection conn = DriverManager.getConnection(dbURL, username, password);
	 
	    if (conn != null) {
	        System.out.println("Connected");
	    }
	} catch (SQLException ex) {
	    ex.printStackTrace();
	}


}
}

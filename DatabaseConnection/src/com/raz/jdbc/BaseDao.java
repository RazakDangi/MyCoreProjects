/**
 * 
 */
package com.raz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author USER
 *
 */
public class BaseDao {
	
	public  Connection getDriverAndConncetion()
	{
		Connection con=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("not able to load the Driver");
		}
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rad", "root", "Welcome123");
		} catch (SQLException e) {
			System.out.println("not able to get connection");
		}
		
		return con;
		
	}

}

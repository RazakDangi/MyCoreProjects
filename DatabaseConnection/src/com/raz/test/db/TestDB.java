/**
 * 
 */
package com.raz.test.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.raz.jdbc.BaseDao;

/**
 * @author USER
 *
 */
public class TestDB {

	private static final String INSERT = "insert into xyz(id) values(169);";
	private static final String CREATE = "create table ashihs(id " +
			"int  not null," +
			"name varchar(10) not null" +
			");";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Connection con=null;
		
		Statement st = null;
		Statement st2=null;
		try {
			BaseDao baseDao=new BaseDao();
			con=baseDao.getDriverAndConncetion();
			System.out.println(con.isClosed());
			 st=con.createStatement();
			 System.out.println(st.isClosed());
			int x=st.executeUpdate(INSERT);
			System.out.println(x);
			
			 st2= con.createStatement();
			 int rs=st2.executeUpdate(CREATE);
			
			 
		} catch (SQLException e) {
			System.out.println("not able to get statement"+e.getLocalizedMessage());
		}
		finally
		{
		if(st != null &&st2!=null)
		{
			try {
				st.close();
				st2.close();
			} catch (SQLException e) {
				System.out.println("not able to close stat");
			}
			if(con !=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("not able to release connection");
				}
			}
		}
		}
		

	}

}

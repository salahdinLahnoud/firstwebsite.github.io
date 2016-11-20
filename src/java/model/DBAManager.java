/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author salahdin
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBAManager
{
	static Connection conn;

	public static Connection getConnection()
	{
		try
		{
			String url = "jdbc:mysql://localhost:3306/";
			String dbName ="restaurant"; 
			String uname = "root";
			String pwd = "";

			Class.forName("com.mysql.jdbc.Driver");
			try
			{
				conn = DriverManager.getConnection(url+dbName,uname,pwd);
			}
			catch (SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		return conn;
	}

}



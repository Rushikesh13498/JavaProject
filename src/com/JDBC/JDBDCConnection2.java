package com.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;
public class JDBDCConnection2 {


		static String drivername="com.mysql.cj.jdbc.Driver";
		static String url="jdbc:mysql://localhost:3306/studentdb";
		static String username="root";
		static  String userpass="hrishi2200";
		static Connection conn;
		static  java.sql.Statement stmt;
		static String sql;
		public static void getConnect() throws ClassNotFoundException,SQLException{
	Class.forName(drivername);
	System.out.println("driver loaded");
	Connection conn=DriverManager.getConnection(url, username, userpass);
	System.out.println("connected to db");
	stmt=conn.createStatement();
	sql="update student set totalmarks=95 where sid=101";
	int result=stmt.executeUpdate(sql);
	System.out.println("result:"+result);
	if(result>0)
		System.out.println("record updated");
	else
		System.out.println("record not updated");
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			try {
				getConnect();
			}catch (ClassNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

	}



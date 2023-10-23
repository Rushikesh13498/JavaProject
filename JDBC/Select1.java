package JDBC;

import java.sql.*;

public class Select1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException  {
			//2)
			
			Class c=null;
			Connection con=null;
			try {
				c = Class.forName("com.mysql.cj.jdbc.Driver");
				//3)
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bike_showroom?autoReconnect=true&useSSL=false", "root", "Mysql@123");
				System.out.println("connection established");
				//4)
				Statement st=con.createStatement();
				//5)
				ResultSet rs=st.executeQuery("select * from feedback_rating");
				
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
				}
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("connection not established");
				e.printStackTrace();
				
			}
			
			
			

		}

	

	}



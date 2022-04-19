package com.crude;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudeDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL="jdbc:mysql://127.0.0.1:3306/Sample";
		String dbUserName="root";
		String dbPassword="Sinsouhit3";
		try
		{
			Connection c=DriverManager.getConnection(dbURL,dbUserName,dbPassword);
			String sql = "select * from Employee";
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery(sql);
			
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String pass=rs.getString(3);
				String email=rs.getString("email");
				String res="User: %d: %s - %s - %s";
				System.out.println(String.format(res,id, name, pass, email));
			}
			c.close();
		}
			/*PreparedStatement p= c.prepareStatement(sql);
			p.setString(1, "101");
			p.setString(2, "Soujan Poojari");
			p.setString(3, "souj123");
			p.setString(4, "soujansp5@gmail.com");
			int row = p.executeUpdate();
			if(row>0) {
				System.out.println("New user Added");
			}
			 c.close();
				
				
				
		}*/
		catch(SQLException e)
		{
			e.printStackTrace();
		}
			

	}
}



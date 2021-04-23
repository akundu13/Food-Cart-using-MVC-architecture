package com.foodcart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FoodCartDbUtil 
{
	public static List<Food> getFoodList() throws ClassNotFoundException,SQLException
	{
		String url="";
		String user="";
		String pass="";
		
		ArrayList<Food> food=new ArrayList<>();
		
		//Load the MySQL Driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//Get the connection
		Connection con=DriverManager.getConnection(url,user,pass);
		
		//Create statement
		Statement state=con.createStatement();
		
		//Execute the statement and loop over the result set
		ResultSet rs=state.executeQuery("select * from foods");
		
		while(rs.next())
		{
			int id=rs.getInt(1);
			String item=rs.getString(2);
			String price=rs.getString(3);
			Food f=new Food(id,item,price);
			food.add(f);
		}
		return food;
	}
}

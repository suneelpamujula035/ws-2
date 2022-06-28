package com.suneel.foodcart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FoodCartDBUtil {

	
	public static List<Food> getFoodList() throws ClassNotFoundException, SQLException
	{
		ArrayList<Food> food = new ArrayList<Food>();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from foodcart");
		while(rs.next())
			
		{
			int id = rs.getInt(1);
			String item = rs.getString(2);
			int price = rs.getInt(3);
			
			Food f = new Food(id, item, price);
			food.add(f);
		}
		return food;
	}
}

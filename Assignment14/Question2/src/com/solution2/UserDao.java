package com.solution2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDao implements AutoCloseable{
private Connection con;
public UserDao() throws SQLException{
	con=DbUtil.getConnection();
}

	@Override
	public void close() throws SQLException{
		if(con!=null)
		{
			con.close();
		}
	}
	
	public int create(User c) throws SQLException {
		Scanner sc=new Scanner(System.in);
		String sql="INSERT INTO candidates VALUES(default,?,?,?,?,?,default,default) ";
		System.out.println(sql);
        try(PreparedStatement stmt=con.prepareStatement(sql)){
        	stmt.setString(1, c.getFirst_name());
        	stmt.setString(2, c.getLast_name());
        	stmt.setString(3, c.getEmail());
        	stmt.setString(4, c.getPassword());
        	stmt.setString(5, c.getDob());
        int cnt=stmt.executeUpdate();
        	return cnt;
        }		
	}
	public List<User> getAll() throws SQLException{
	List<User> list=new ArrayList<>();
	String sql="SELECT * FROM candidates";
	try(PreparedStatement stmt=con.prepareStatement(sql)){
		try(ResultSet rs=stmt.executeQuery()){
			while(rs.next()) {
				int id=rs.getInt("user_id");
				String first_name=rs.getString("first_name");
				String last_name=rs.getString("last_name");
				String email=rs.getString("email");
				String password=rs.getString("password");
				java.sql.Date sdate=rs.getDate("dob");
				java.util.Date dob=new java.util.Date(sdate.getTime());
				boolean status =rs.getBoolean("status");
				String role=rs.getString("role");
				User user=new User(id, first_name, last_name, email, password, dob, status, role);
				
				list.add(user);
				
				
				
				
			}
		}
		
	}
	
	
	return list;
}
}	


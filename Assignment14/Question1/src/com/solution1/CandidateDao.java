package com.solution1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateDao implements AutoCloseable{
	
private Connection con;
public CandidateDao() throws SQLException{
	con=DbUtil.getConnection();
}
	@Override
	public void close() {
		try {
			if(con!=null)
				 con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	//add new Candidate
	public int save(Candidate c) throws SQLException{
		Scanner sc=new Scanner(System.in);
		String sql="INSERT INTO candidates VALUES(default,?,?,?)";
		System.out.println(sql);
		try(PreparedStatement stmt=con.prepareStatement(sql)){
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getVotes());
			int cnt=stmt.executeUpdate();
			return cnt;
		}//stmt.close();
		
		}
	int update(Candidate c) throws SQLException{
		String name1=c.getName();
		String party1=c.getParty();
		String sql="UPDATE candidates set name=?,party=? where id=?";
		try(PreparedStatement stmt=con.prepareStatement(sql)){
			stmt.setString(1, name1);
			stmt.setString(2, party1);
			stmt.setInt(3, c.getId());
			int cnt=stmt.executeUpdate();
			return cnt;
		}
	}
	public List<PartyVotes>getPartywiseVotes() throws SQLException{
		List<PartyVotes> list=new ArrayList<>();
		String sql="SELECT party,sum(votes) totalvotes FROM candidates GROUP BY party";
		try(PreparedStatement stmt=con.prepareStatement(sql)){
			try(ResultSet rs=stmt.executeQuery()){
				while(rs.next()) {
					String party=rs.getString("party");
					int votes=rs.getInt("totalvotes");
					PartyVotes pv=new PartyVotes(party,votes);
					list.add(pv);
					
				}
			}
		}
		return list;
	}
		
	}
	
	



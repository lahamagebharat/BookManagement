package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceImpl {

	private static final String Db_url = "jdbc:mysql://localhost:3306/bookproject";
	private static final String username = "root";
	private static final String password = "root";
	private static PreparedStatement pstmt;
	private static Connection con;

	public static Connection dbconnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(Db_url, username, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;

	}

	public static int insertBook(int id, String name, String author, double price) throws Exception {
		Connection con = dbconnection();
		String sql = "insert into book values (?,?,?,?);";
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, author);
		pstmt.setDouble(4, price);
		int i = pstmt.executeUpdate();
		return i;

	}

	public static void fetchallrows() throws SQLException {
		Connection con = dbconnection();
		String sql = "select * from book";
		pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String author = rs.getString(3);
			double price = rs.getDouble(4);
			System.out.println(id + " " + name + " " + author + " " + price);
		}
	}

	public static void fetchallrowswithid(int bid) throws SQLException {
		Connection con = dbconnection();
		String sql = "select * from book where id=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, bid);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String author = rs.getString(3);
			double price = rs.getDouble(4);
			System.out.println(id + " " + name + " " + author + " " + price);
		}
	}

}

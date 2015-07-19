package com.shixian.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDUtil {
	/**
	 * jdbc的数据库连接
	 * 
	 */
	private String dbUrl="jdbc:mysql://localhost:3306/db_book";
	private String dbName="root";
	private String dbPassword="123qwe";
	private String dbDriver="com.mysql.jdbc.Driver";
	
	public Connection getCon() throws Exception{
		
		Class.forName(dbDriver);
		Connection conn=DriverManager.getConnection(dbUrl,dbName,dbPassword);
		return conn;
		
	}
	public void close(Connection conn) throws Exception{
		if(conn!=null){
			conn.close();
			
		}
	}
	public static void main(String[] args) {
		JDUtil jdUtil=new JDUtil();
		try {
			jdUtil.getCon();
			System.out.println("数据库连接成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

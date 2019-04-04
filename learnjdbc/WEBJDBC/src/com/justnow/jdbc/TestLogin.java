package com.justnow.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class TestLogin {
	@Test
	public void testLogin() {
		try {
			loginother("admin' or admin'","admin");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void loginother(String username, String password) throws ClassNotFoundException, SQLException {
		//1. 注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2. 获取连接
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "*");
		//3. 编写sql语句
		String sql = "select * from users where username=? and password=?";
		//4. 创建预处理对象
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//5.设置参数(给占位符)
		pstmt.setString(1,  username);
		pstmt.setString(2, password);
		//6. 执行查询操作
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			System.out.println("恭喜您，登陆成功");
			System.out.println(sql);
		}else {
			System.out.println("账号密码错误！");
		}
		
		if(rs!=null) {
			rs.close();
		}
		if(pstmt!=null) {
			pstmt.close();
		}
		if(conn!=null) {
			conn.close();
		}
	}
	
	
	public void login(String username, String password) throws ClassNotFoundException, SQLException {
		//1.注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2. 获取连接
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "*");
		//3. 创建执行SQL语句的对象
		Statement stmt = conn.createStatement();
		//4.书写一个sql语句
		String sql = "select * from users where " + "username='"+username+"'"+" and password='"+password+"'";
		//5. 执行sql语句
		ResultSet rs = stmt.executeQuery(sql);
		//6.对结果集进行处理
		if(rs.next()) {
			System.out.println("恭喜您，登陆成功");
			System.out.println(sql);
		}else {
			System.out.println("账号密码错误！");
		}
		
		if(rs!=null) {
			rs.close();
		}
		if(stmt!=null) {
			stmt.close();
		}
		if(conn!=null) {
			conn.close();
		}
	}
}

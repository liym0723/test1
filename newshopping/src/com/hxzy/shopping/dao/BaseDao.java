package com.hxzy.shopping.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 所有Dao类需要基础的父类
 * @author 李勇明
 *
 */
public class BaseDao {
	private String diverNameString="oracle.jdbc.driver.OracleDriver";
	private String url="jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	private String userName = "shopping";
	private String pwd = "admin";
	
	public Connection conn; // 连接 
	public PreparedStatement statment; // 用来向数据库发送要执行的SQL语句的
	public ResultSet rs; //结果集的时候使用，查询
	//第一步 第二步 打开数据库连接
	public Connection getConnection() throws Exception{
		//1.加载驱动类
	//	conn.isClosed();//判断连接是否关闭
		Class.forName(diverNameString);
		//2.获取连接
		conn = DriverManager.getConnection(url,userName,pwd);
		
		return conn;
	}
	/**
	 * 查询 修改第三部
	 * @param sql
	 * @param objects
	 * @return
	 * @throws Exception
	 */
	//Object[] objects 有没有问号需要传入进来 Object数组接收
	public ResultSet executQuery(String sql,Object[] objects) throws Exception{
		getConnection();
		statment = conn.prepareStatement(sql);
		if(objects != null && objects.length > 0){ //objects.length > 0加强安全性
			for (int i = 0; i < objects.length; i++) {
				statment.setObject(i+1, objects[i]);
			}
		}
		
		rs = statment.executeQuery();
		return rs;
	}
	
	/**
	 * 增删查改
	 * @param sql
	 * @param objects
	 * @return
	 * @throws Exception
	 */
	 public int executUpdate(String sql,Object[] objects) throws Exception{
		 getConnection();
		 statment = conn.prepareStatement(sql);
		 if(objects != null && objects.length > 0){ //objects.length > 0加强安全性
				for (int i = 0; i < objects.length; i++) {
					statment.setObject(i+1, objects[i]);
				}
			}
		 
		 int num = statment.executeUpdate();
		 return num;
	 }
	
	
	/** 
	 * 最后一步 关闭资源
	 * @throws Exception
	 */
	//关闭资源
	public void closeConnection(){
		try {
			if(rs != null){ rs.close();}
			if(statment != null){ statment.close();}
			if(conn != null){ conn.close();}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

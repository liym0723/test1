package com.hxzy.shopping.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ����Dao����Ҫ�����ĸ���
 * @author ������
 *
 */
public class BaseDao {
	private String diverNameString="oracle.jdbc.driver.OracleDriver";
	private String url="jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	private String userName = "shopping";
	private String pwd = "admin";
	
	public Connection conn; // ���� 
	public PreparedStatement statment; // ���������ݿⷢ��Ҫִ�е�SQL����
	public ResultSet rs; //�������ʱ��ʹ�ã���ѯ
	//��һ�� �ڶ��� �����ݿ�����
	public Connection getConnection() throws Exception{
		//1.����������
	//	conn.isClosed();//�ж������Ƿ�ر�
		Class.forName(diverNameString);
		//2.��ȡ����
		conn = DriverManager.getConnection(url,userName,pwd);
		
		return conn;
	}
	/**
	 * ��ѯ �޸ĵ�����
	 * @param sql
	 * @param objects
	 * @return
	 * @throws Exception
	 */
	//Object[] objects ��û���ʺ���Ҫ������� Object�������
	public ResultSet executQuery(String sql,Object[] objects) throws Exception{
		getConnection();
		statment = conn.prepareStatement(sql);
		if(objects != null && objects.length > 0){ //objects.length > 0��ǿ��ȫ��
			for (int i = 0; i < objects.length; i++) {
				statment.setObject(i+1, objects[i]);
			}
		}
		
		rs = statment.executeQuery();
		return rs;
	}
	
	/**
	 * ��ɾ���
	 * @param sql
	 * @param objects
	 * @return
	 * @throws Exception
	 */
	 public int executUpdate(String sql,Object[] objects) throws Exception{
		 getConnection();
		 statment = conn.prepareStatement(sql);
		 if(objects != null && objects.length > 0){ //objects.length > 0��ǿ��ȫ��
				for (int i = 0; i < objects.length; i++) {
					statment.setObject(i+1, objects[i]);
				}
			}
		 
		 int num = statment.executeUpdate();
		 return num;
	 }
	
	
	/** 
	 * ���һ�� �ر���Դ
	 * @throws Exception
	 */
	//�ر���Դ
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

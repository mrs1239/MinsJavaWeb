package com.dao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
/**
 * ��������ݿ����ӳ��л�ȡ��ָ�����ݿ������
 * @author min
 *
 */
public class DBManager {
	private static  DataSource dataSource;
	  static{
	         //ֻ������һ��
	       dataSource=new ComboPooledDataSource("mysql");  // myc3p0 һ��Ҫ�������ļ��е�����һ��
	   } 
	 /**
	    * ��������Դ��һ��Connection ����
	    * @return
	    * @throws Exception 
	    */
	   public  Connection getConnection() throws Exception{
		   Connection conn =null;
		   if(dataSource!=null) {
			   try {
				   conn = dataSource.getConnection();
				   
			   }catch(SQLException e) {
				   throw new RuntimeException("��ȡ���ݿ�����ʧ��");
			   }
		   }
	       return conn;
	    }    
	   private DBManager() {}
	   //����ģʽ�����캯��˽�л����������þ�̬��������ȡ��̬���ԣ�ʵ��
	   private static  DBManager instance = new DBManager();
	   public static  DBManager getInstance() {
		   return instance;
	   }
}

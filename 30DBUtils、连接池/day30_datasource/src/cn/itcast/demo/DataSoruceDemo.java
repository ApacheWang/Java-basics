package cn.itcast.demo;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

/*
 *  ���ӳ�jar����,�����һ���� BasicDataSource
 *  ʵ��������Դ�Ĺ淶�ӿ� javax.sql.DataSource
 */
public class DataSoruceDemo {
	public static void main(String[] args) {
		//����DataSource�ӿڵ�ʵ�������
		//ʵ����, org.apache.commons.dbcp
		BasicDataSource dataSource = new BasicDataSource();
		//�������ݿ��4���������Ϣ,ͨ�����󷽷�setXXX���ý���
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/mybase");
		dataSource.setUsername("root");
		dataSource.setPassword("123");
		
		try{
		//���ö��󷽷�getConnection��ȡ���ݿ������
			Connection con = dataSource.getConnection();
			System.out.println(con);
		}catch(SQLException ex){
//			System.out.println(ex);
			throw new RuntimeException("���ݿ�����ʧ��");
		}
	}
}

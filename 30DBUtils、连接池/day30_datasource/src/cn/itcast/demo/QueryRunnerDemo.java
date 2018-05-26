package cn.itcast.demo;
/*
 *  ����д�õĹ�����,
 *  �ṩ����һ��DataSource�ӿڵ�����Դ
 *  QueryRunner�๹�췽��,����DataSource�ӿڵ�ʵ����
 *  ����,���÷���update,query,���贫������Connection���Ӷ���
 */

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import cn.itcast.jdbcutils.JDBCUtils;
public class QueryRunnerDemo{
    public static void main(String[] args) {
    	select();
	}
	//����2������,ʵ�����ݱ�����,���ݱ��ѯ
	//QueryRunner�����,д�����Աλ��
	private static QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource()); 
	
	//���ݱ��ѯ
	public static void select(){
		String sql = "SELECT * FROM sort";
		try{
		List<Object[]> list = qr.query(sql, new ArrayListHandler());
		for(Object[] objs : list){
			for(Object obj : objs){
				System.out.print(obj+"\t");
			}
			System.out.println();
		}
		}catch(SQLException ex){
			throw new RuntimeException("���ݲ�ѯʧ��");
		}
	}
	
	//���ݱ��������
	public static void insert(){
		String sql = "INSERT INTO sort (sname,sprice,sdesc)VALUES(?,?,?)";
		Object[] params = {"ˮ��",100.12,"�ո����еĺ���"};
		try{
			int row = qr.update(sql, params);
			System.out.println(row);
		}catch(SQLException ex){
			throw new RuntimeException("�������ʧ��");
		}
	}
	
}

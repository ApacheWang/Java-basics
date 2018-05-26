package cn.itcast.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *   DateFormat�෽�� parse
 *   ���ַ�������Ϊ���ڶ���
 *   Date parse(String s) �ַ���������ڶ���
 *   String => Date parse
 *   Date => String format
 *   
 */
public class SimpleDateFormatDemo1 {
	public static void main(String[] args) throws Exception{
		function();
	}
	/*
	 *  ���ַ���ת��Date����
	 *  DateFormat�෽�� parse
	 *  ����:
	 *    1. ����SimpleDateFormat�Ķ���
	 *       ���췽����,ָ������ģʽ
	 *    2. �������,���÷��� parse ����String,����Date
	 *    
	 *    ע��: ʱ������ڵ�ģʽyyyy-MM-dd, ������ַ����е�ʱ������ƥ��
	 *                     1995-5-6
	 *    
	 *    ����,�������û���������, ���ڸ�����������
	 *    �û�ѡ�����ʽ
	 */
	public static void function() throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("1995-5-6");
		System.out.println(date);
	}
}

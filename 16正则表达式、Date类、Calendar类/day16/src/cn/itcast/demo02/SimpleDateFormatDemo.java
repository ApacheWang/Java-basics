package cn.itcast.demo02;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *  �����ڽ��и�ʽ�� (�Զ���)
 *    �����ڸ�ʽ������ java.text.DateFormat ������, ��ͨ����,Ҳ�г���ķ���
 *    ʵ��ʹ�������� java.text.SimpleDateFormat ����ʹ�ø�����ͨ����,��д�˳��󷽷�
 */
public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		function();
	}
	/*
	 * ��ζ����ڸ�ʽ��
	 *  ����:
	 *    1. ����SimpleDateFormat����
	 *       ���๹�췽����,д���ַ��������ڸ�ʽ (�Լ�����)
	 *    2. SimpleDateFormat���÷���format�����ڽ��и�ʽ��
	 *         String format(Date date) �������ڶ���,�����ַ���
	 *    ����ģʽ:
	 *       yyyy    ���
	 *       MM      �·�
	 *       dd      ���е�����
	 *       HH       0-23Сʱ
	 *       mm      Сʱ�еķ���
	 *       ss      ��
	 *       yyyy��MM��dd�� HH��mm����ss��  �����޸�,: -  ��ĸ��ʾ��ÿ���ֶβ��������д
	 */
	public static void function(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH��mm����ss��");
		String date = sdf.format(new Date());
		System.out.println(date);
	}
}

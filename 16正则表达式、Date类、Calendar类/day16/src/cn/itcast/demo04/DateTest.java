package cn.itcast.demo04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateTest {
	public static void main(String[] args) throws Exception {
		function_1();
	}
	/*
	 *  �������
	 *  2000 3000
	 *  �߼����㷨: �������õ�ָ����ݵ�3��1��,add��ǰƫ��1��,��ȡ����,29����
	 */
	public static void function_1(){
		Calendar c = Calendar.getInstance();
		//������,���õ�ָ�����3��1��
		c.set(2088, 2, 1);
		//����add����,��ǰƫ��1��
		c.add(Calendar.DAY_OF_MONTH, -1);
		//get������ȡ����
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
	}
	
	/*
	 *  ������˶�����
	 *   ����  ���������
	 *   �������ڱ�ɺ���ֵ,����
	 */
	public static void function() throws Exception {
		System.out.println("������������� ��ʽ YYYY-MM-dd");
		//��ȡ��������,��������
		String birthdayString = new Scanner(System.in).next();
		//���ַ�������,ת��Date����
		//����SimpleDateFormat����,д����ģʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//���÷���parse,�ַ���ת�����ڶ���
		Date birthdayDate = sdf.parse(birthdayString);
		
		//��ȡ��������ڶ���
		Date todayDate = new Date();
		
		//����������ת�ɺ���ֵ,Date��ķ���getTime
		long birthdaySecond = birthdayDate.getTime();
		long todaySecond = todayDate.getTime();
		long secone = todaySecond-birthdaySecond;
		
		if(secone < 0){
			System.out.println("��û������");
		}
		else{
		System.out.println(secone/1000/60/60/24);
		}
		
	}
}

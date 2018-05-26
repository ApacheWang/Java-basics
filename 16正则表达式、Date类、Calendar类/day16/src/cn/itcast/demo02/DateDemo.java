package cn.itcast.demo02;

import java.util.Date;

/*
 *  ʱ���������
 *    java.util.Date
 *    
 *  �������: 1000����=1��
 *  
 *  �����0��: 
 *     System.currentTimeMillis() ����ֵlong���Ͳ���
 *     ��ȡ��ǰ���ڵĺ���ֵ   3742769374405
 *     ʱ��ԭ��; ��Ԫ1970��1��1��,��ҹ0:00:00 Ӣ����������  ����ֵ����0
 *     ʱ��2088��8��8��
 *  
 *  ��Ҫ: ʱ������ڵļ���,������������ֵ
 *    XXX-XXX-XX = ����
 *    
 * 		long time = System.currentTimeMillis();
		System.out.println(time);
 */
public class DateDemo {
	public static void main(String[] args) {
		function_3();
	}
	/*
	 * Date�෽�� setTime(long )���ݺ���ֵ
	 * �����ڶ���,���õ�ָ������ֵ��
	 * ����ֵת�����ڶ���
	 * Date�Ĺ��췽��
	 */
	public static void function_3(){
		Date date = new Date();
		System.out.println(date);
		
		date.setTime(0);
		System.out.println(date);
	}
	
	/*
	 *   Date�෽�� getTime() ����ֵlong
	 *   ���ص��Ǻ���ֵ
	 *   ��Date��ʾ������,ת�ɺ���ֵ
	 *   ���ںͺ���ֵת��
	 */
	public static void function_2(){
		Date date = new Date();
		long time = date.getTime();
		System.out.println(time);
	}
	
	/*
	 * Date���long�����Ĺ��췽��
	 * Date(long ) ��ʾ����ֵ
	 * ���ݺ���ֵ,������ֵת�ɶ�Ӧ�����ڶ���
	 */
	public static void function_1(){
		Date date = new Date(0);
		System.out.println(date);
	}
	
	/*
	 * Date��ղ������췽��
	 * ��ȡ������,��ǰ����ϵͳ�е�ʱ�������
	 */
	public static void function(){
		Date date = new Date();
		System.out.println(date);
	}
}

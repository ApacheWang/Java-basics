package cn.itcast.demo5;

import java.math.BigDecimal;

public class BigDecimalDemo {
	public static void main(String[] args) {
		function_1();
	}
	/*
	 * BigDecimalʵ�ֳ�������
	 * divide(BigDecimal divisor, int scale, int roundingMode) 
	 * int scale : ������λС��
	 * int roundingMode : ����ģʽ
	 * ����ģʽ �Ķ�API�ĵ�
	 *   static int ROUND_UP  ����+1
	 *   static int ROUND_DOWN ֱ����ȥ
	 *   static int ROUND_HALF_UP  >= 0.5 ����+1
	 *   static int ROUND_HALF_DOWN   > 0.5 ����+1 ,����ֱ����ȥ
	 */
	public static void function_1(){
		BigDecimal b1 = new BigDecimal("1.0301");
		BigDecimal b2 = new BigDecimal("100");
		//����b1/b2����,���÷���divied
		BigDecimal bigDiv = b1.divide(b2,2,BigDecimal.ROUND_HALF_UP);//0.01301
		System.out.println(bigDiv);
	}
	
	/*
	 *  BigDecimalʵ����������
	 *  + - *
	 */
	public static void function(){
		BigDecimal b1 =  new BigDecimal("0.09");
		BigDecimal b2 =  new BigDecimal("0.01");
		//����b1+b2�ĺ�,���÷���add
		BigDecimal bigAdd = b1.add(b2);
		System.out.println(bigAdd);
		
		BigDecimal b3 = new BigDecimal("1");
		BigDecimal b4 = new BigDecimal("0.32");
		//����b3-b2�Ĳ�,���÷���subtract
		BigDecimal bigSub = b3.subtract(b4);
		System.out.println(bigSub);
		
		BigDecimal b5 = new BigDecimal("1.015");
		BigDecimal b6 = new BigDecimal("100");
		//����b5*b6�ĳɼ�,���÷��� multiply
		BigDecimal bigMul = b5.multiply(b6);
		System.out.println(bigMul);
	}
}


/*
 * ������,δ֪
 * ԭ��: �������������,��ʾ����������ȷ���
 * �������͵ĸ�������,�ṩ�߾��ȵĸ�������, BigDecimal
System.out.println(0.09 + 0.01);//0.09999999999999999
System.out.println(1.0 - 0.32);//0.6799999999999999
System.out.println(1.015 * 100);//101.49999999999999
System.out.println(1.301 / 100);//0.013009999999999999 
*/
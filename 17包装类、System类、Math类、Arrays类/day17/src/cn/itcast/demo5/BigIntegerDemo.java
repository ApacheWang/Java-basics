package cn.itcast.demo5;

import java.math.BigInteger;

/*
 *  ���������������
 *    ����longȡֵ��Χ����,��װ��BigInteger���͵Ķ���
 */
public class BigIntegerDemo {
	public static void main(String[] args) {
		function_1();
	}
	/*
	 * BigInteger�������������
	 * ���÷�������,������Ҳֻ����BigInteger����
	 */
	 public static void function_1(){
		 BigInteger b1 = new BigInteger("5665464516451051581613661405146");
		 BigInteger b2 = new BigInteger("965855861461465516451051581613661405146");
		 
		 //���� b1+b2����ĺ�,���÷��� add
		 BigInteger bigAdd = b1.add(b2);//965855867126930032902103163227322810292
		 System.out.println(bigAdd);
		 
		 //����b1-b2����Ĳ�,���÷���subtract
		 BigInteger bigSub = b1.subtract(b2);
		 System.out.println(bigSub);
		 
		 //����b1*b2����ĳ˻�,���÷���multiply
		 BigInteger bigMul = b1.multiply(b2);
		 System.out.println(bigMul);
		 
		 //����b2/b1������,���÷���divied
		 BigInteger bigDiv = b2.divide(b1);
		 System.out.println(bigDiv);
	 }
	
	/*
	 * BigInteger��Ĺ��췽��
	 * �����ַ���,Ҫ�����ָ�ʽ,û�г�������
	 */
	public static void function(){
		BigInteger b = new BigInteger("8465846668464684562385634168451684568645684564564");
		System.out.println(b);
		BigInteger b1 = new BigInteger("5861694569514568465846668464684562385634168451684568645684564564");
		System.out.println(b1);
	}
}

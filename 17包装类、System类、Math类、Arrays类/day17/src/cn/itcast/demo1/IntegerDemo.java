package cn.itcast.demo1;
/*
 * Integer��,��װ������������int,��ߴ�������
 * ���ַ���ת�ɻ�����������int
 * 
 * 
 * Integer i = Integer.valueOf("1");
 * i.intValue()
 */
public class IntegerDemo {
	public static void main(String[] args) {
		function_3();
	}
	/*
	 *  Integer�๹�췽��
	 *   Integer (String s)
	 *   �����ָ�ʽ���ַ���,���ݵ�Integer��Ĺ��췽����
	 *   ����Integer����,��װ����һ���ַ���
	 *   �����췽���е��ַ���,ת�ɻ�����������,���÷���,�Ǿ�̬��, intValue()
	 */
	public static void function_3(){
		Integer in = new Integer("100");
		int i = in.intValue();
		System.out.println(--i);
	}
	
	/*
	 *  ��ν���������int,����ַ���
	 *  
	 *  int => String  �κ�����+"" ���String����
	 *  Integer���еľ�̬����toString()
	 *  
	 *  toString(int ,int ����), ��int����,ת��ָ��������
	 *  0-9A-Z
	 */
	public static void function_2(){
		int i = 3;
		String s = i+"";
		System.out.println(s+1);
		
		String s1 = Integer.toString(5,2);
		System.out.println(s1);
	}
	
	
	/*
	 * Integer�ྲ̬����parseInt(String s, int radix)
	 * radix����,����
	 * "110",2 ���� ǰ��������Ƕ����Ƶ�,���Ƿ���parseInt���н������ʮ����
	 */
	public static void function_1(){
		int i = Integer.parseInt("110", 2);
		System.out.println(i);
	}
	
	/*
	 * Integer���о�̬���� parseInt(String s) ���ػ�����������
	 * Ҫ��: �ַ������������ָ�ʽ��
	 */
	public static void function(){
		int i = Integer.parseInt("12");
		System.out.println(i/2);
	}
}

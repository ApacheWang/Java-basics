package cn.itcast.demo1;
/*
 *  Integer���е���������
 *  ������������,��2����̬��Ա����
 */
public class IntegerDemo1 {
	public static void main(String[] args) {
		function_1();
	}
	/*
	 * Integer���3����̬����
	 * �����Ƶ�ת��
	 * ʮ����ת�ɶ�����  toBinarString(int)
	 * ʮ����ת�ɰ˽���  toOctalString(int)
	 * ʮ����ת��ʮ������  toHexString(int)
	 * ��������,����ֵ������String��ʽ����
	 */
	public static void function_1(){
		System.out.println(Integer.toBinaryString(99));
		System.out.println(Integer.toOctalString(99));
		System.out.println(Integer.toHexString(999));
	}
	
	/*
	 *   Integer��ľ�̬��Ա����
	 *   MAX_VALUE
	 *   MIN_VALUE
	 */
	public static void function(){
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}

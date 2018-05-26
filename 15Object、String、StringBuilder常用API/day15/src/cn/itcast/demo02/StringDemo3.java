package cn.itcast.demo02;
 /*
  *  String�๹�췽��
  *  String��Ĺ��췽��,������ʽ
  * 
  */
public class StringDemo3 {
	public static void main(String[] args) {
		function_1();
	}
	/*
	 * String(char[] value) �����ַ�����
	 * ���ַ�����,ת���ַ���, �ַ�����Ĳ���,����ѯ�����
	 * 
	 * String(char[] value, int offset, int count) �����ַ�����
	 * ���ַ������һ����ת���ַ���
	 * offset  ���鿪ʼ����
	 * count   ����
	 */
	public static void function_1(){
		char[] ch = {'a','b','c','d','e','f'};
		//����String���췽��,�����ַ�����
		String s = new String(ch);
		System.out.println(s);
		
		String s1 = new String(ch,1,4);
		System.out.println(s1);
	}
	
	
	/*
	 *  ���巽��,String��Ĺ��췽��
	 *  String(byte[] bytes)  �����ֽ�����
	 *  �ֽ�����ת���ַ���
	 *  ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ���� byte ���飬����һ���µ� String��
	 *  ƽ̨ : ��������ϵͳ
	 *  Ĭ���ַ���: ����ϵͳ�е�Ĭ�ϱ����, Ĭ�ϱ����GBK
	 *  ���ֽ������е�ÿ���ֽ�,��ѯ�˱����,�õ��Ľ��
	 *  �ֽ��Ǹ���,���ֵ��ֽڱ�����Ǹ���, Ĭ�ϱ���� ,һ�����ֲ���2���ֽڱ�ʾ
	 *  
	 *  String(byte[] bytes, int offset, int length) �����ֽ�����
	 *  �ֽ������һ����ת���ַ���
	 *  offset �������ʼ������
	 *  length ����,ת����   , ���ǽ���������
	 */
	public static void function(){
		byte[] bytes = {97,98,99,100};
		//����String��Ĺ��췽��,�����ֽ�����
		String s = new String(bytes);
		System.out.println(s);
		
		byte[] bytes1 ={65,66,67,68,69};
		//����String���췽��,��������,����2��intֵ
		String s1 = new String(bytes1,1,3);
		System.out.println(s1);
	}
}

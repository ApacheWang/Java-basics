package cn.itcast.demo02;

public class StringDemo2 {
	public static void main(String[] args) {
		//�ַ������巽ʽ2��, ֱ��=  ʹ��String��Ĺ��췽��
		String str1 = new String("abc");
		String str2 = "abc";
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1==str2);//������������,�Ƚ϶���ĵ�ַ false
		System.out.println(str1.equals(str2));//true
	}
}

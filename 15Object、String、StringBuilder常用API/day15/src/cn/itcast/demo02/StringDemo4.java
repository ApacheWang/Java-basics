package cn.itcast.demo02;
/*
 *  String��Ĳ��ҹ���
 */
public class StringDemo4 {
	public static void main(String[] args) {
		function_9();
	}
	/*
	 *  boolean equals(Object obj)
	 *  ���������ַ���,�ж��ַ����е��ַ��Ƿ���ȫ��ͬ,�����ȫ��ͬ����true
	 *  
	 *  boolean equalsIgnoreCase(String s)
	 *  �����ַ���,�ж��ַ����е��ַ��Ƿ���ͬ,���Դ�Сд
	 */
	public static void function_9(){
		String str1 = "Abc";
		String str2 = "abc";
		//�ֱ����equals��equalsIgnoreCase
		boolean b1 = str1.equals(str2);
		boolean b2 = str1.equalsIgnoreCase(str2);
		System.out.println(b1);
		System.out.println(b2);
	}
	
	/*
	 * char[] toCharArray() ���ַ���ת���ַ�����
	 * ���ܺ͹��췽���෴
	 */
	public static void function_8(){
		String str = "itcast";
		//����String��ķ���toCharArray()
		char[] ch = str.toCharArray();
		for(int i = 0 ; i < ch.length ; i++){
			System.out.println(ch[i]);
		}
	}
	
	/*
	 *  byte[] getBytes() ���ַ���ת���ֽ�����
	 *  �˹��ܺ�String���췽���෴
	 *  byte������صĹ���,��ѯ�����
	 */
	public static void function_7(){
		String str = "abc";
		//����String�෽��getBytes�ַ���ת���ֽ�����
		byte[] bytes = str.getBytes();
		for(int i = 0 ; i < bytes.length ; i++){
			System.out.println(bytes[i]);
		}
	}
	
	/*
	 *  int indexOf(char ch)
	 *  ����һ���ַ�,���ַ����е�һ�γ��ֵ�����
	 *  �����ҵ��ַ�������,����-1
	 */
	public static void function_6(){
		String str = "itcast.cn";
		//����String��ķ���indexOf
		int index = str.indexOf('x');
		System.out.println(index);
	}
	
	/*
	 *  boolean contains (String s)
	 *  �ж�һ���ַ�����,�Ƿ������һ���ַ���
	 */
	public static void function_5(){
		String str = "itcast.cn";
		//����String��ķ���contains
		boolean b =str.contains("ac");
		System.out.println(b);
	}
	
	/*
	 * boolean endsWith(String prefix)
	 * �ж�һ���ַ����ǲ�����һ���ַ����ĺ�׺,��β
	 * Demo.java
	 *     .java
	 */
	public static void function_4(){
		String str = "Demo.java";
		//����String�෽��endsWith
		boolean b = str.endsWith(".java");
		System.out.println(b);
	}
	
	/*
	 * boolean startsWith(String prefix)  
	 * �ж�һ���ַ����ǲ�����һ���ַ�����ǰ׺,��ͷ
	 * howareyou
	 * hOw
	 */
	  public static void function_3(){
		  String str = "howareyou";
		  //����String��ķ���startsWith
		  boolean b = str.startsWith("hOw");
		  System.out.println(b);
	  }
	
	/*
	 *  String substring(int beginIndex,int endIndex) ��ȡ�ַ�����һ����
	 *  �����µ��ַ���
	 *  ����ͷ,������β��
	 *  
	 *  String substring(int beginIndex)��ȡ�ַ�����һ����
	 *  ����ͷ,������ַ�ȫҪ
	 */
	public static void function_2(){
		String str = "howareyou";
		//����String�෽��substring��ȡ�ַ���һ����
		str= str.substring(1, 5);
		System.out.println(str);
		
		String str2 = "HelloWorld";
		str2 = str2.substring(1);
		System.out.println(str2);
	}
	
	/*
	 *  int length() �����ַ����ĳ���
	 *  �������ٸ��ַ�
	 */
	public static void function(){
		String str = "cfxdf#$REFewfrt54GT";
		//����String�෽��length,��ȡ�ַ�������
		int length = str.length();
		System.out.println(length);
	}
}

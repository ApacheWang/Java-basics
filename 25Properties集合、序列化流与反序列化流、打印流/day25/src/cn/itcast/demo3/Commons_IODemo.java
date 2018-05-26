package cn.itcast.demo3;

import org.apache.commons.io.FilenameUtils;

public class Commons_IODemo {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 * FilenameUtils��ķ���
	 * static boolean isExtension(String filename,String extension)
	 * �ж��ļ����ĺ�׺�ǲ���extension
	 */
	public static void function_2(){
		boolean b = FilenameUtils.isExtension("Demo.java", "java");
		System.out.println(b);
	}
	
	/*
	 * FilenameUtils��ķ���
	 * static String getName(String filename)
	 * ��ȡ�ļ���
	 */
	public static void function_1(){
		String name = FilenameUtils.getName("c:\\windows\\");
		System.out.println(name);
	}
	
	/*
	 * FilenameUtils��ķ���
	 * static String getExtension(String filename)
	 * ��ȡ�ļ�������չ��
	 */
	 public static void function(){
		 String name = FilenameUtils.getExtension("c:\\windows");
		 System.out.println(name);
	 }
}

package cn.itcast.demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 *  ��ӡ��
 *    PrintStream
 *    PrintWriter
 *  ��ӡ�����ص�:
 *   1. ��������������Դ,ֻ��������Ŀ��
 *   2. Ϊ���������,��ӹ���
 *   3. ��Զ�����׳�IOException
 *      ����,�����׳�����쳣
 *   
 *   ������ӡ���ķ���,��ȫһ��
 *    ���췽��,���Ǵ�ӡ�������Ŀ�Ķ�
 *    PrintStream
 *       ���췽��,����File����,�����ַ����ļ���,�����ֽ������OutputStream
 *    PrintWriter  
 *       ���췽��,����File����,�����ַ����ļ���,�����ֽ������OutputStream, �����ַ������Writer
 *   
 */
public class PrintWriterDemo {
	public static void main(String[] args) throws  IOException {
		function_3();

	}
	/* 
	 * ��ӡ��,���Կ����Զ�ˢ�¹���
	 * ����2������:
	 *   1. ���������Ŀ�ı�����������
	 *       OutputStream  Writer
	 *   2. �������println,printf,format���������е�һ��,�����Զ�ˢ��
	 */
	public static void function_3()throws  IOException{
		//File f = new File("XXX.txt");
		FileOutputStream fos = new FileOutputStream("c:\\5.txt");
		PrintWriter pw = new PrintWriter(fos,true);
		pw.println("i");
		pw.println("love");
		pw.println("java");
		pw.close();
	}
	
	/*
	 * ��ӡ��,���Ŀ��,��������
	 * �������ֽ������,�������ַ��������
	 * OutputStream  Writer
	 */
	public static void function_2() throws IOException{
	//	FileOutputStream fos = new FileOutputStream("c:\\3.txt");
		FileWriter fw = new FileWriter("c:\\4.txt");
		PrintWriter pw = new PrintWriter(fw);
		pw.println("��ӡ��");
		pw.close();
	}
	/*
	 * ��ӡ��,���Ŀ��,String�ļ���
	 */
	public static void function_1() throws FileNotFoundException{
		PrintWriter pw = new PrintWriter("c:\\2.txt");
		pw.println(3.5);
		pw.close();
	}
	
	/*
	 * ��ӡ��,��File���������Ŀ��д������
	 * ����print println  ԭ�����
	 * write���������
	 */
	public static void function() throws FileNotFoundException{
		File file = new File("c:\\1.txt");
		PrintWriter pw = new PrintWriter(file);
		pw.println(true);
		pw.write(100);
		pw.close();
	}
}




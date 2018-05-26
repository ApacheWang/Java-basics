package cn.itcast.demo2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * ��ӡ��ʵ���ı�����
 *   ��ȡ����Դ  BufferedReader+File ��ȡ�ı���
 *   д������Ŀ�� PrintWriter+println �Զ�ˢ��
 */
public class PrintWriterDemo1 {
	public static void main(String[] args) throws IOException{
		BufferedReader bfr = new BufferedReader(new FileReader("c:\\a.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("d:\\a.txt"),true);
		String line = null;
		while((line = bfr.readLine())!=null){
			pw.println(line);
		}
		pw.close();
		bfr.close();
	}
}

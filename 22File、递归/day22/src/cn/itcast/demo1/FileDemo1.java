package cn.itcast.demo1;

import java.io.File;

/*
 *  File��Ļ�ȡ,�ļ���ȡ������
 *  ����Ŀ¼��ʱ��,���Ը�����Ҫ,ֻ��ȡ�����������ļ�
 *  ����Ŀ¼���� listFiles()������ʽ
 *  listFiles(FileFilter filter)�ӿ�����
 *  ����FileFilter�ӿڵ�ʵ����
 *  �Զ���FileFilter�ӿ�ʵ����,��д���󷽷�,
 *  �ӿ�ʵ������󴫵ݵ���������listFiles
 */
public class FileDemo1 {
	public static void main(String[] args) {
		File file = new File("c:\\demo");
		File[] fileArr = file.listFiles(new MyFilter());
		for(File f : fileArr){
			System.out.println(f);
		}
	}
}

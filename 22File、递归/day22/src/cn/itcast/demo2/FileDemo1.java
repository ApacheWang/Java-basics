package cn.itcast.demo2;

import java.io.File;

/*
 *  ����Ŀ¼,��ȡĿ¼�µ�����.java�ļ�
 *  �����༶Ŀ¼,�����ݹ�ʵ��
 *  �����Ĺ�����,ʹ�ù�����
 */
public class FileDemo1 {
	public static void main(String[] args) {
		getAllJava(new File("c:\\demo"));
//		new File("c:\\demo").delete();
	}
	/*
	 * ���巽��,ʵ�ֱ���ָ��Ŀ¼
	 * ��ȡĿ¼�����е�.java�ļ�
	 */
	public static void getAllJava(File dir){
		//����File���󷽷�listFiles()��ȡ,���������
		File[] fileArr = dir.listFiles(new MyJavaFilter());
		for(File f : fileArr){
			//��f·��,�ж��ǲ����ļ���
			if(f.isDirectory()){
				//�ݹ�����ļ��б���
				getAllJava(f);
			}else{
				System.out.println(f);
			}
		}
	}
}

package cn.itcast.demo1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 *  IO������,ʵ�ֶ���Person���л�,�ͷ����л�
 *  ObjectOutputStream д����,ʵ�����л�
 *  ObjectInputStream ��ȡ����,ʵ�ַ����л�
 */
public class ObjectStreamDemo {
	public static void main(String[] args)throws IOException, ClassNotFoundException {
//		writeObject();
		readObject();
	}
	/*
	 * ObjectInputStream
	 * ���췽��:ObjectInputStream(InputStream in)
	 * ����������ֽ�������,��������װ�ļ�,���������л����ļ�
	 * Object readObject()  ��ȡ����
	 */
	public static void readObject() throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("c:\\person.txt");
		//���������л���,���췽����,�����ֽ�������
		ObjectInputStream ois = new ObjectInputStream(fis);
		//���÷����л����ķ��� readObject()��ȡ����
		Object obj =ois.readObject();
		System.out.println(obj);
		ois.close();
	}
	
	/*
	 * ObjectOutputStream
	 * ���췽��: ObjectOutputStream(OutputSteam out)
	 * ����������ֽ������
	 * void writeObject(Object obj)д������ķ���
	 */
	public static void writeObject() throws IOException{
		//�����ֽ������,��װ�ļ�
		FileOutputStream fos = new FileOutputStream("c:\\person.txt");
		//����д����������л����Ķ���,���췽�������ֽ������
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Person p = new Person("lisi",25);
		//�������л����ķ���writeObject,д������
		oos.writeObject(p);
		oos.close();
	}
}

/*
  ������������, ����һ����  Scanner
  java�Ѿ�������,��Sun��˾Ϊ�������õ���,ʹ����
  ���������������ͱ���,�ͻ������ͱ�������
    int a = 1;
	��ʽ:
	  ����  ������ = new ����();
	����: ������Scanner��ı���
	
	  Scanner sc = new Scanner();
	  int a = 1;
	ÿ����������,�����Լ��Ĺ���,���ʹ�ù���
	��ʽ:
	  ����.��������()
	  
	Scanner��,����,��������������,���ܼ��̵�����
	ʹ��Scanner�ಽ��:
	  1. �����,ָ�������ڵ��ļ���, �ؼ��� import
	     java�ļ���-util�ļ���
	  2. ��ʽ,������Scanner���ͱ���
	  3. ����.ʹ��Scanner���еĹ���,��ɼ������� 
*/
import java.util.Scanner;
public class ScannerDemo{
	public static void main(String[] args){
		// ����  ������ = new ����();
		// ������Scanner,�����
		Scanner sc = new Scanner(System.in);
		//����.��������() ���ܼ�������
		// ����: nextInt() ���ܼ�������,��֤�����������
		// ���ܽ��ܵ����ݾ�������,�������к�Ľ��������������
		int i = sc.nextInt();
		System.out.println(i);
		
		//Scanner�����һ������    next() ���ܼ���������ַ���
		
		String s = sc.next();
		System.out.println(s);
	}
}





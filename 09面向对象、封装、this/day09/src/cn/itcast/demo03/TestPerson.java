package cn.itcast.demo03;
/*
 *  �����Ĳ�������,�ǻ�����������,������������
 */
public class TestPerson {
	public static void main(String[] args) {
		int a = 1;
		function(a);
		System.out.println(a);
		
		Person p = new Person();
		p.name = "����";
		System.out.println(p.name);
		
		function(p);
		
		System.out.println(p.name);
	}
	/*
	 * ���巽��,����������������������
	 * ������Person����
	 * p���ܵ���һ���ڴ�ĵ�ַ
	 * main �еı���p
	 * function  �еı���p  ����ĵ�ַ��һ����
	 */
	public static void function(Person p){
		p.name = "����";
	}
	
	/*
	 * ���巽��,���������ǻ�����������
	 */
	public static void function(int a){
		a+=5;
	}
}

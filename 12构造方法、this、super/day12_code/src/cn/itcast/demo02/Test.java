package cn.itcast.demo02;

public class Test {
	public static void main(String[] args) {
		//����Person��Ķ���
		//�����ڵ������Ĺ��췽��
		
		//1. ���ÿղ������췽��,��������
		Person p1 = new Person();
		p1.setAge(18);
		p1.setName("����");
		System.out.println(p1.getName()); 
		System.out.println(p1.getAge()); 
		
		//2. ������2�������Ĺ��췽��,��������
		Person p2 = new Person("Сǿ", 17);
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		
	}
}

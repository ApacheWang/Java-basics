package cn.itast.demo03;

public class Test {
	public static void main(String[] args) {
		System.out.println(Person.className);
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "����";
		p2.name = "����";
		System.out.println(p1.name);
		System.out.println(p2.name);
		
		//���������ľ�̬��Ա����
		p1.className = "������";
		System.out.println(p2.className);
		
	}
}

package cn.itcast.demo06;

public class PersonTest {
	public static void main(String[] args) {
		//����Person���е�����ȽϹ���
		//������2��Person����
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.setAge(15);
		p2.setAge(16);
		
		//p1��������Լ��ķ���compare����p2����
		boolean b = p1.compare(p2);
		System.out.println(b);
	}
}

package cn.itcast.demo07;

public class Test {
	public static void main(String[] args) {
		//�������˶���, Worker,ָ����������
		Worker w = new Worker("��ͷǿ", 30);
		System.out.println(w.getName());
		System.out.println(w.getAge());
		
		//����ѧ������, Student,ָ����������
		Student s = new Student("�ʲ�", 5);
		System.out.println(s.getName());
		System.out.println(s.getAge());
	}
}

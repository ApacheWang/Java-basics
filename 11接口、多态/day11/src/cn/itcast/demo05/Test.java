package cn.itcast.demo05;

public class Test {
	public static void main(String[] args) {
		// ��̬���÷���,�������������������д!!
		
		//Java��,����Ķ�̬��,���ó����еķ���
		// ��ʽ:  �������ͻ����ǽӿ�����   ����  = new ����Ķ���();
		Fu  f  = new Zi();
		f.show();
		
		//������Animal,������Cat
		Animal a = new Cat();
		a.eat();
		
		//�ӿ�Smoking,ʵ����Student
		Smoking sk = new Student();
		sk.smoking();
	}
}

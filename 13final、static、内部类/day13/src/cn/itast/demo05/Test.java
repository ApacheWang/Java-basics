package cn.itast.demo05;
/*
 *  �����ֶ���,�������ͱ���,���Է���ʹ��
 *  ��������,û�����ñ���,ֻ��ʹ��һ��
 *  
 *  ����������Ե�����������
 *  ����������Ե��������ķ���ֵ
 */

public class Test {
	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
		
		new Person().eat();
		new Person().eat();
		
		method(new Person());
		
		Person p1 = method();
		p1.eat();
	}
	
	//��������ֵ��Person����
	//����return���,���ص��������Ķ���
	public static Person method(){
		//Person p = new Person();
		return new Person();
	}
	
	
	//���÷���method,����Person���Ͷ���
	public static void method(Person p){
		p.eat();
	}
}

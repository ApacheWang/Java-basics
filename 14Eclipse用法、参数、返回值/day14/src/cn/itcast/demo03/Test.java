package cn.itcast.demo03;

import java.util.Calendar;

public class Test {
	public static void main(String[] args) {
		//ֱ�ӵ��ó�����ľ�̬����getInstance��ȡ�����������Ķ���
		//������ľ�̬����,�������Լ����������
		//���ڵ���������: ����Ҫ��ע������˭
		Animal a = Animal.getInstance();
		a.eat();
		
		//������
		Calendar c = Calendar.getInstance();
		System.out.println(c);
	}
}

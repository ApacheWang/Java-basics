package cn.itcast.demo01;
/*
 *  new �����ʱ��,�����ڵ��ö���Ĺ��췽��
 *   new Person(); ���õ������еĿղ������췽��
 *   new Person("����",20); �������е��в������췽��
 */
public class Test {
	public static void main(String[] args) {
		Person p = new Person("����",20);		
		//����p ���÷���getName,getAge
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
	}
}

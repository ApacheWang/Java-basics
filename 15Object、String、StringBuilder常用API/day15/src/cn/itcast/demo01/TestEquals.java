package cn.itcast.demo01;

public class TestEquals {
	public static void main(String[] args) {
		//Person��̳�Object��,�̳������˸���ķ���equals
		Person p1 = new Person("����",20);
		Person p2 = new Person("����",20);
		
      
		//Person����p1,���ø���ķ���equals,���ж���ıȽ�
		boolean b = p1.equals(p1);
		System.out.println(b);
		boolean bo  = p1.equals(p2);
	}
}

package cn.itcast.demo07;
/*
 *  ������Ƚ������, ������ֵ
 *  �ؼ���, instanceof, �Ƚ�������������
 *  
 *  Person p = new Student();
 *  p  = new Teacher()

 *  
 *  �ؼ��� instanceof �Ƚ�, һ���������͵ı���,�ǲ���������͵Ķ���
 *  p����,��Student���Ͷ���,����Teacher���Ͷ���
 *  
 *    ���ñ��� instanceof ����
 *    p instanceof Student  �Ƚ�,p�ǲ���Student���͵Ķ���,�����,intanceof����true
 *  
 */
public class Test {
	public static void main(String[] args) {
		Person p = new Student();
//		Person p = new Teacher();
		
		boolean b = p instanceof Student;
		System.out.println(b);
		
		//b = p instanceof Animal;
		//System.out.println(b);
		p.sleep();
	}
}

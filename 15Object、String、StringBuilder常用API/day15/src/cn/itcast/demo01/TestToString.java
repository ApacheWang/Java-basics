package cn.itcast.demo01;


public class TestToString {
	public static void main(String[] args) {
		//����Person��ķ���toString()
		//��������,д����һ������,Ĭ�ϵ��ö����toString����
		Person p = new Person("����",20);
		String s = p.toString();
		System.out.println(p);
		System.out.println(s);
		/*
		 * System.out.println(p);
		 * System.out.println(p.toString());
		 */
		
		/*Random r = new Random();
		System.out.println(r.toString());
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.toString());*/
	}
}

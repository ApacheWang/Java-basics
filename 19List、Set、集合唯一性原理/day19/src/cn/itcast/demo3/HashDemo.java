package cn.itcast.demo3;
/*
 *  ����Ĺ�ϣֵ,��ͨ��ʮ��������
 *  ����Object,���� public int hashCode() ������int����
 */
public class HashDemo {
	public static void main(String[] args) {
		Person p = new Person();
		int i = p.hashCode();
		System.out.println(i);
	
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		/*System.out.println("�ص�".hashCode());
		System.out.println("ͨ��".hashCode());*/
	}
}

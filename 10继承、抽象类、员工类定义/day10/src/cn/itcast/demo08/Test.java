package cn.itcast.demo08;
/*
 *  ����Ա������
 *    ���������������Ķ���
 */
public class Test {
	public static void main(String[] args) {
		JavaEE ee = new JavaEE();
		Network net = new Network();
		
		ee.setName("����");
		ee.setId("�з���001");
		
		net.setName("����");
		net.setId("ά����007");
		
	//	System.out.println(ee.getName()+"..."+ee.getId());
	//	System.out.println(net.getName()+"..."+net.getId());
		
		ee.work();
		net.work();
	}
}

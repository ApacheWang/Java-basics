package cn.itcast.classes;
/*
 *  ͨ������get,��ȡ����Person��Ķ���
 *  Person����Ĵ���,����get���������
 */
public class TestReturn {
	public static void main(String[] args) {
		//����GetPerson��ķ���get
		//����ֵ��Person����
		GetPerson g = new GetPerson();
		Person p = g.get();
		p.eat();
		p.run();
		
	//	new GetPerson().get().eat();
	}
}

package cn.itcast.demo04;
/*
 *   ����õ�Person����в���
 *   ��������,����������Ժͷ���
 */
public class PersonTest {

	public static void main(String[] args) {
		//����Person��Ķ���  new
		Person p = new Person();
		//�Գ�Ա������ֵ
		//p.age = -200;
		//�Գ�Ա����age��ֵ,ֻ�ܵ���Set������ֵ
		p.setAge(50);
		
		p.name = "����";
		//�������з���
		p.speak();
		
		//�����Ա����ageֵ,�������get����
		System.out.println(p.getAge());
	}

}

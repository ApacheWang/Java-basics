package cn.itcast.classes;
/*
 *  Person��,���������Ĳ���
 *  Person����д�ڷ����Ĳ����б���
 */
public class TestArguments {

	public static void main(String[] args) {
		//���÷���operatorPerson,����Person���Ͷ���
		Person p = new Person();
		operatorPerson(p);
	
		operatorPerson(new Person());
	}
	/*
	 *  ����operatorPerson,����������Person����
	 *  ���÷���operatorPerson,���봫��Person���͵Ķ���
	 */
	public static void operatorPerson(Person p){
		//����ʹ����������p����Person��Ĺ���
		p.eat();
		p.run();
	}

}

package cn.itcast.demo01;

public class Person extends Object{
	private String name;
	private int age;
	
	public Person(){}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/*
	 * ��д����ķ���toString()
	 * û�б�Ҫ�õ����߿����ڴ��ַ
	 * Ҫ��: ������,�����������г�Ա������ֵ
	 */
	public String toString(){
		return name + age;
	}
	
	
	/*
	 * �������equals����д����,��д����ķ���
	 * ����,���ı丸�෽����Դ����, ����equals �Ƚ�����������ڴ��ַ
	 * 
	 * ��������,�Ƚϵ�ַ,û������
	 * �Ƚ���������ĳ�Ա����,age
	 * �����������age��ͬ,����true,��ͬ����false
	 * 
	 * ��д�����equals,�Լ������Լ�����ıȽϷ�ʽ
	 */
	public boolean equals(Object obj){
		if( this == obj){
			return true;
		}
		
		//�Բ���obj,��null�ж�
		if( obj == null){
			return false;
		}
		
		if( obj instanceof Person){
			// ����obj���ܵ���Person����,����ת��
			// ��obj�����������͵�����ת��,objת��Person����
			Person p = (Person)obj;
			return this.age ==  p.age;
		}
		return false;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	 
}

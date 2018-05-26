package cn.itcast.demo3;

public class Person {
	private String name;
	private int age;

	/*
	 *  û������д����,ÿ�����н�����ǲ�ͬ����
	 *  ���������д����ķ���,��ϣֵ,�Զ����
	 *  �洢��HashSet���ϵ�����
	 */
	public int hashCode(){
		return name.hashCode()+age*55;
	}
	//����equals��д����,��֤�͸�����ͬ
	//public boolean equals(Object obj){}
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(obj instanceof Person){
			Person p = (Person)obj;
			return name.equals(p.name) && age==p.age;
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
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person(){}
	
	public String toString(){
		return name+".."+age;
	}
	


}

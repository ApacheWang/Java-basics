package cn.itcast.demo1;

import java.io.Serializable;

public class Person implements Serializable{
	public String name;
	public /*transient��ֹ��Ա�������л�*/ int age;
	//��,�Զ��������к�,����������������к�
	private static final long serialVersionUID = 1478652478456L;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person(){}
	
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
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
}

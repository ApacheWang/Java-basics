package cn.itcast.demo02;
/*
 *   ���췽������������
 *     �����б�ͬ
 */
public class Person {
	private String name;
	private int age;
	
	//д�ղ������췽��
	public Person(){
		
	}
	
	//д�������������Ĺ��췽��
	public Person(String name,int age){
		this.name = name;
		this.age = age;
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

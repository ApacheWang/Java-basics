package cn.itcast.demo05;

/*
 *   ��������:
 *     ����: ����������
 *     ����: ˵��
 *   
 *   ˽�л����е����� (��Ա����) ,����д��Ӧ��get/set����
 *   �����Զ������,�Զ����Ա����,Ӧ��˽�л�,�ṩget/set
 *   
 *   this�ؼ���:
 *     ���ֳ�Ա�����;ֲ�����ͬ�����
 *     ������,��λ��Ա����,дthis.
 */
public class Person {
	private String name;
	private int age;

	// set����,����name,age��ֵ
	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	// get����,����name,age��ȡֵ
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void speak() {
		String  name = "����";
		int age = 16;
		
		System.out.println("����˵��  " + this.name + "..." + this.age);
	}
}

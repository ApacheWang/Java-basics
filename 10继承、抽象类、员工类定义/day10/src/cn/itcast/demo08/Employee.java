package cn.itcast.demo08;
/*
 *  ����Ա����
 *    ����,������������Ĺ��Գ�ȡ
 *      ����: ����,����
 *      ����: ����
 */
public abstract class Employee {
	//�����Ա��������
	private String name;
	//�����Ա��������
	private String Id; 
	
	
	//���幤������
	public abstract void work();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}
	
	
}

package cn.itcast.hotel;
/*
 *  �����ʦ��
 *    ����Ա��һ��,���ж��������
 *    �̳�Employee,ʵ��VIP�ӿ�
 */
public class FuWuYuan extends Employee implements VIP{
	//�ղ������췽��
	public FuWuYuan() {
		super();
		
	}
   //���������췽��
	public FuWuYuan(String name, String id) {
		super(name, id);
		
	}
	
	//���󷽷���д
	public void work(){
		System.out.println("����Ա���ϲ�");
	}
	


	public void services(){
		System.out.println("����Ա���˿͵���");
	}
}

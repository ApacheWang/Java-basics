package cn.itcast.demo06;
/*
 	���췽����һ��,дthis()����super()
 	����ͬʱ����,��ѡ��һ,��֤��������й��췽�����õ�����Ĺ��췽������
 	
 	С����: �������,��������й��췽��,ֱ��,��ӱ�����õ����๹�췽��
 	����Ĺ��췽��,ʲô����д,Ĭ�ϵĹ��췽����һ�� super();
 */
public class Student extends Person{
	public Student(){
		//���õ����Լ��Ĺ��췽��
		//�����ʽ���õ��˸���Ĺ��췽��
		this("abc");
	}
	
	public Student(String s){
		super(1);
	}
}

package cn.itcast.demo05;
/*
 *  ���๹�췽���ı���ԭ��: �Ҳ�������Ŀղ���������
 *  ������,û����д����,���������Ĭ�ϵĿղ���
 *  public Student(){
 *     super();
 *  }
 *  ����ɹ�,�����ֶ���д���췽��,������super�м������
 *  
 *  ע��: ���������еĹ��췽��,�������ض��ٸ�,��һ�б�����super()
 *  ��������ж�����췽��,�����������һ���Ϳ���
 *  super()�������ǹ��췽����һ�д���
 */
public class Student extends Person{
	public Student(){
		
		super(0.1);
	
	}
	
	public Student(String s){
		super(1);
	}
}

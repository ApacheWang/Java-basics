package cn.itcast.interfaces;

public class TestArguments {
	public static void main(String[] args) {
		//����noSmoking����,����ʵ�������
		//ʵ����������Լ��Ķ���
		/*Student s = new Student();
		noSmoking(s);
		
		noSmoking( new Student());*/
		
		//ʵ�������,�ǲ��ö�̬��������
		Smoking s = new Student();
		noSmoking(s);
	}
	/*
	 * ���巽��,��������,�ӿ�����
	 * �����Ĳ�����Smoking�Ľӿ�����
	 * ���÷���,���봫�ݽӿڵ������ʵ����Ķ���
	 */
	public static void noSmoking(Smoking s){
		//���ýӿ��еĳ���A
		//System.out.println(Smoking.A);
		//�ӿڵ����ñ���s,���÷���
		s.smoking();
	}
}

package cn.itcast.interfaces;

public class TestReturn {
	public static void main(String[] args) {
		//����GetSmoking��ķ���getSmoking��ȡSmoking�ӿڵ�ʵ����Ķ���
		GetSmoking g = new GetSmoking();
		Smoking s = g.getSmoking();//������ִ�н���ǽӿڵ�ʵ������� new Student()
		s.smoking();
	}
}

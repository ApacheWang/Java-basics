package cn.itast.demo06;

public class Test {
	public static void main(String[] args) {
		/*
		 *  �����ⲿ���е��ڲ���ķ���inner()
		 *  �����ⲿ�����,�ҵ��ڲ���,ͨ���ڲ������,�����ڲ���ķ���
		 *  ��ʽ:
		 *    �ⲿ����.�ڲ�����  ���� = new �ⲿ�����().new �ڲ������();
		 *    ����.�ڲ��෽��()
		 */
		Outer.Inner in = new Outer().new Inner();
		in.inner();
	}
}

package cn.itast.demo09;

public class Test {
	public static void main(String[] args) {
		//ʹ�������ڲ���
		/*
		 *  ����ʵ����,��д����,����ʵ�������,һ���㶨
		 *  ��ʽ:
		 *    new �ӿڻ��߸���(){
		 *       ��д���󷽷�
		 *    };
		 *    �� new��ʼ,���ֺŽ���
		 *    �����˽ӿڵ�ʵ����Ķ���
		 */
		new Smoking(){
			public void smoking(){
				System.out.println("��������");
			}
		}.smoking();
	}
}

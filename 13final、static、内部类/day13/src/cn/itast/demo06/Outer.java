package cn.itast.demo06;
/*
 *   �ڲ���Ķ���
 *     ���ڲ���,���������ⲿ�ĳ�Աλ��
 *   ����Outer,�ڲ�����Inner
 *   
 *   ��Ա�ڲ���,����ʹ�ó�Ա���η�,public static ....
 *   Ҳ�Ǹ���,���Լ̳�,����ʵ�ֽӿ�
 *   
 *   ���ù���: �ڲ���,����ʹ���ⲿ���Ա,����˽��
 *   �ⲿ��Ҫʹ���ڲ���ĳ�Ա,���뽨���ڲ������
 */
public class Outer {
	private int a = 1;
	//�ⲿ���Աλ��,�����ڲ���
    class Inner{
		public void inner(){
			System.out.println("�ڲ��෽��inner "+a);
		}
	}
}

package cn.itast.demo02;

public class Test {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.function();
		z.show();
		
		final int i = 10;//��final����,һ�θ�ֵ,������
		System.out.println(i);
		
		//final�������ñ�������
		//����,�����ڴ��ַ,������  
		final Zi z2 = new Zi();
		z2.function();
		
	}
}

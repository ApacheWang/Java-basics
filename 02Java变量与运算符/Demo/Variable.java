/*
   ����Java�еı���
   ����������������͵ı���
   �������
  
*/
	
public class Variable {
	public static void main(String[] args){
		//�����������ͣ��ֽ����� byte����
		//�ڴ���1���ֽڣ� -128 127
		byte b = 100;
		System.out.println(b);
		
		//�����������ͣ������ͣ� short����
		//�ڴ���2���ֽڣ� -32768 32767
		short s = 200;
		System.out.println(s);
		
		//�����������ͣ� ���ͣ� int����
		//�ڴ���4���ֽڣ� -2147483648  2147483647
		int i = 500006;
		System.out.println(i);
		
		//�����������ͣ� �����ͣ� long����
		//�ڴ���8���ֽ�
		long l = 21474836407L;
		System.out.println(l);
		
		//���帡�����ݣ� ������ float����
		//�ڴ���4���ֽ�
		float f = 1.0F;
		System.out.println(f);
		
		
		//���帡�����ݣ� ˫���� double����
		//�ڴ���8���ֽ�
		double d = 2.2;
		System.out.println(d);
		
		//�����ַ�����, char
		//�ڴ���2���ֽ�, ���뵥���Ű���,ֻ��д1���ַ�
		char c = '��';
		System.out.println(c);
		
		//���岼������, boolean
		//�ڴ���1���ֽ�, ����ֵ, true false
		boolean bool = true;
		System.out.println(bool);
	}
}
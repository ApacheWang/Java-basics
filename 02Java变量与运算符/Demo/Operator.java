/*
   ���������
   + �ӷ�,����
   - ����
   * �˷�
   / ����
   % ȡģ, ��ȡ����
   ++ ����1
   -- �Լ�1
*/
public class Operator{
	public static void main(String[] args){
		// + ��������,��һ���ַ���������������������
		// + �����ַ���,������ӷ���"5+5=55"
		// + �κ�����ֻҪ���ַ���+, ���е����ݶ�������ַ��� 
		System.out.println("5+5="+5+5);
		
		// ��������
		int i = 100;
		int j = 9;
		System.out.println(i/j);
		
		//ȡģ����,���������,��ȡ��������
		int k = 6;
		int m = 4;
		System.out.println(k%m);
		
		
		//�������� ++
		int a = 3;
		int b = 4;
		
		a++; // ����a�Լ�����1
		System.out.println(a);
		
		++b;
		System.out.println(b);
	}
}
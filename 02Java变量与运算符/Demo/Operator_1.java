/*
  ++ д�ڱ���ǰ��,��д�ڱ�������,����
  a = 1
  a++ 
  ++a
  ����д��ǰ��,���Ǻ���,�ڱ����Լ����������ʱ��,û������
  
  ���Ǳ���,Ҫ�ǲ�������������,��������
  
  j=i++ ++����,�Ƚ�i��ֵ,��ֵj, i�Լ���++
  n=++m ++����,����m++ 6 ������ֵ��n
*/
public class Operator_1{
	public static void main(String[] args){
		int i = 5;
		int j = i++;
		System.out.println(i); //6
		System.out.println(j); //5
		
		int m = 5;
		int n = ++m;
		System.out.println(m);
		System.out.println(n);
	}
}
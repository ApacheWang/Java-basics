/*
    �������������� (overload)
	��ͬһ������,�������ͬ���ķ���,ֻҪ�����Ĳ����б�ͬ����,����������������
	�����б�ͬ: �����ĸ���,��������,˳��
*/
public class MethodOverLoadDemo{
	public static void main(String[] args){
		//�������صĵ���,���ݲ������ݽ�������
		//System.out.println();
		double sum = getSum(2.3,3.5);
		System.out.println(sum);
	}
	/*
	  �Բ������,���÷�������������
	*/
	public static int getSum(int a,int b){
		System.out.println("����int����");
		return a+b;
	}
	public static int getSum(int a,int b,int c){
		System.out.println("����int����");
		return a+b+c;
	}
	public static double getSum(double a,double b){
		System.out.println("����double����");
		return a+b;
	}
	/*
	   ���巽��,�Բ������
	   ����,û�涨����,��������
	
	public static int getSum(int a ,int b){
		return a+b;
	}
	
	public static double getSumDouble(double a,double b){
		return a+b;
	}
	public static int getSum3(int a,int b, int c){
		return a+b+c;
	}*/
}
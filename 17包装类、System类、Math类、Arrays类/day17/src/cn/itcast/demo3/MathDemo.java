package cn.itcast.demo3;
/*
 *  ��ѧ����Ĺ�����
 *  java.lang.Math ��̬�������
 */
public class MathDemo {
	public static void main(String[] args) {
		function_6();
	}
	/*
	 *  static double round(doubl d)
	 *  ��ȡ��������������,ȡ����
	 */
	public static void function_6(){
		double d = Math.round(5.4195);
		System.out.println(d);
	}
	
	/*
	 *  static double random() ��������� 0.0-1.0֮��
	 *  ��Դ,Ҳ��Random��
	 */
	public static void function_5(){
		for(int i = 0 ; i < 10 ;i++){
			double d = Math.random();
			System.out.println(d);
		}
	}
	
	/*
	 * static double sqrt(double d)
	 * ���ز�����ƽ����
	 */
	public static void function_4(){
		double d = Math.sqrt(-2);
		System.out.println(d);
	}
	
	/*0
	 * static double pow(double a, double b)
	 * a��b�η�
	 */
	public static void function_3(){
		double d = Math.pow(2, 3);
		System.out.println(d);
	}
	
	/*
	 * static double floor(double d)
	 * ����С�ڻ��ߵ��ڲ���d���������
	 */
	public static void function_2(){
		double d = Math.floor(1.5);
		System.out.println(d);
	}
	
	/*
	 *  static double ceil(double d)
	 *  ���ش��ڻ��ߵ��ڲ���d����С����
	 */
	public static void function_1(){
		double d = Math.ceil(5.1);
		System.out.println(d);
	}
	
	/*
	 *  static int abs(int i)
	 *  ��ȡ�����ľ���ֵ
	 */
	 public static void function(){
		int i = Math.abs(0);
		System.out.println(i);
	 }
	 
}

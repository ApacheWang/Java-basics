/*
   �����Ķ�����ϰ
*/
import java.util.Scanner;
public class MethodDemo_1{
	public static void main(String[] args){
		//printRect();
		//int number = getNumber();
		//System.out.println(getNumber());
		//printRect2(3,5);
		double avg = getAvg(2,2,3);
		System.out.println(avg);
	}

	/*
	   �����з���ֵ�в���������������������ƽ��ֵ
	   ��ȷ������������������, ����ֵ���� double
	   ��ȷ����δ֪��, ����δ֪������
	*/
	public static double getAvg(double a, double b,double c){
		 return (a+b+c)/3;
	}
	
	/*
	    �����޷���ֵ�в������������ӡָ��M�У�ÿ��N��*�ŵľ���
		��ȷ�����������,����̨���ͼ��,û�з���ֵ��
		��������û��δ֪��,ͼ������,������,��δ֪��, ������������int
	*/
	public static void printRect2(int m,int n){
		for(int i = 0 ; i < m ; i++){
			for(int j = 0 ; j < n ;  j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/*
	   �����з���ֵ�޲��������������¼��õ�һ������
	   ��ȷ��������������������� int
	   ��ȷ��û��δ֪��,û
	*/
	public static int getNumber(){
		Scanner sc = new Scanner(System.in);
		//int number = sc.nextInt();
		return sc.nextInt();
	}
	
	/*
	   �����޷���ֵ�޲������������ӡ3�У�ÿ��3��*�ŵľ���
	   Ϊʲôû�з���ֵ:
	       ��ӡ���� ,���Ч��,����Ҫ���������
		   ��ȷδ֪��: ����Ҫδ֪��
	*/
	public static void printRect(){
		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 3 ;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
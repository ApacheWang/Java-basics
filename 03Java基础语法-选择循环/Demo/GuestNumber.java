/*
   ʵ�ֲ����ֵ�С��Ϸ
     �����һ������,���û���
	 ����������:
	   ����, ����, С��
	   
	�����: Random
	��������: Scanner
	�µ�����,����������бȽ� if �ж�
	ֱ������Ϊֹ, ����ȥ��,ѭ�� while
*/
import java.util.Random;
import java.util.Scanner;
public class GuestNumber{
	public static void main(String[] args){
		System.out.println("�����ֿ�ʼ��");
		System.out.println("����1-100֮������");
		//����Random�����
		Random ran = new Random();
		//����.ʹ�ù���nextInt()��ȡ1-100�����
		int ranNumber = ran.nextInt(100)+1;
		//System.out.println(ranNumber);
		//����Scanner�����
		Scanner sc = new Scanner(System.in);
		
		while(true){
			//��ȡ��������
			int number = sc.nextInt();
			//�������,�û����������,�Ƚ�
			if( number > ranNumber){
				System.out.println("�´���");
			}else if (number < ranNumber){
				System.out.println("��С��");
			}else{
				System.out.println("����");
				break;
			}
		}
	}
}






/*
    java���Ѿ��е���������  Random��,����,���������
	����:
	  1. �����, Random��,Ҳ��java.util�ļ���
	  2. ��ʽ: ������Random���͵ı���
	  3. ����. ����Random���еĹ���,���������
	  
	  Random��,�ṩ���� , ����  nextInt() ����һ�������, �����int����
	  ����������ķ�Χ, �ڹ���nextInt(дһ������), ����: ��������ķ�Χ
	  ������ķ�Χ��  0 - ָ��������֮��������   nextInt(100)   0-99
	  
	  ��������������: �������� nextDouble()  ������ķ�Χ 0.0-1.0
	  
	  �����: α�����, �����������д�õ�һ���㷨,���ɳ�����
*/
import java.util.Random;
public class RandomDemo{
	public static void main(String[] args){
	   //	2. ��ʽ: ������Random���͵ı���
	   Random ran = new Random();
	   // 3. ����. ����Random���еĹ���,���������
	   // Random���е�,����������Ĺ���
	   int i = ran.nextInt(100);
	   System.out.println(i);
	   
	   //����? ���������,��Χ 1-100֮��
	   // nextInt(100) 0-99 + 1
	   
	   
	   double d = ran.nextDouble();
	   System.out.println(d);
	}
}
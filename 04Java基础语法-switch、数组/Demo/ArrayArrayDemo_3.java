/*
   ��ά����ı������
    ��һС�����۶�Ϊ{11, 12}��Ԫ    
    �ڶ�С�����۶�Ϊ{21, 22, 23}��Ԫ
    ����С�����۶�Ϊ{31, 32, 33, 34}��Ԫ��
	ÿ��С�����һ������, ��������洢��һ��������,�γɶ�ά����
	���:
	  ÿ��С�����
	  ����Ԫ�����
*/

public class ArrayArrayDemo_3{
	public static void main(String[] args){
		int[][] arr = {  {11,12} , {21,22,23} ,{31,32,33,34} };
		//�������,����2����͵�ֵ
		int sum = 0 ; //����Ԫ�ص����
		int groupSum = 0 ; //ÿ��һά��������
		
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = 0 ; j < arr[i].length ; j++){
				//��һά�����Ԫ�����
				groupSum += arr[i][j];
			}
			System.out.println("ÿ��С���ܽ�� "+groupSum);
			
			//��ÿ��һά������ܺ������
			sum += groupSum;
			//ÿ��Ψһ�������,���
			groupSum = 0;
		}
		System.out.println("����˾�ܽ�� "+sum);
	}
}
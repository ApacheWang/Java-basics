/*
  ������������巽ʽ
     ��������[]  ������ = new ��������[]{Ԫ��1,Ԫ��2,Ԫ��3};
	 ע������: new �������������,������д�κ�����,д�˾ͱ���ʧ��
	 
	 ��������[]  ������ = {Ԫ��1,Ԫ��2,Ԫ��3};
*/
public class ArrayDemo_2{
	public static void main(String[] args){
	    //��������,�����ͬʱ,��Ԫ�ؽ��и�ֵ
		int[] arr = new int[]{1,2,4,5,7,9};
		System.out.println(arr.length);
		System.out.println(arr[5]);
		
		
		System.out.println("==================");
		//��������,ֱ�Ӵ����Ÿ�ֵ
		int[] arr2 = {0,2,4,6,8};
		System.out.println(arr2.length);
		System.out.println(arr2[1]);
	}
}
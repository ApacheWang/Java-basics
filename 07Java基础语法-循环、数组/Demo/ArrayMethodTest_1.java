/*
   ���������:
     �����е�Ԫ��,����λ���ϵĽ���
	 ���� ������ �������
	 ������������Զ����������,����λ�ý���,ʵ�����������
	 ʹ�õ��������ָ��˼��,���Ǳ���,˼��,������ʱ�任����
	 ��ת reverse
	 ʵ�ֲ���:
	   1. ���巽��,ʵ�����������
	   2. ��������
	     ʵ���������Զ������λ��
		 ʹ����ʱ�ĵ���������
*/
public class ArrayMethodTest_1{
	public static void main(String[] args){
		int[] arr = {3,5,7,1,0,9,-2};
		//������������򷽷�
		reverse(arr);
		//���������Ԫ��,����
		printArray(arr);
	}
	
	/*
	   ���巽��,ʵ�����������
	   ����ֵ: û�з���ֵ
	   ����:   ������ǲ���
	*/
	public static void reverse(int[] arr){
		//����ѭ��,ʵ���������,����������,��Զ�˻�λ
		//for�ĵ�һ��,����2������, ���,��������++ --
		for( int min = 0 , max = arr.length-1 ; min < max  ; min++,max--){
			//�������е�Ԫ��,����λ�ý���
			//min������max������Ԫ�ؽ���
			//�������,����min����
			int temp = arr[min];
			//max�����ϵ�Ԫ��,��ֵ��min����
			arr[min] =  arr[max];
			//��ʱ����,���������,��ֵ��max������
			arr[max] = temp;
		}
	}
	
	/*
	   ���巽��,ʵ�ֹ���
	   ����ֵ: void
	   ��������: ����
	*/
	public static void printArray(int[] arr){
		//���һ��������,��Ҫ���д�ӡ
		System.out.print("[");
		//������б���
		for(int i = 0 ; i < arr.length ; i++){
			//�жϱ�������Ԫ��,�ǲ�����������һ��Ԫ��
			//����ж� ѭ������ ���� length-1
			if( i == arr.length-1 ){
				//��������Ԫ�غ�]
				System.out.print(arr[i]+"]");
			}else{
			//������������һ��Ԫ��,�������Ԫ�غͶ���
			    System.out.print(arr[i]+",");
			}
		}
		System.out.println();
	}
}






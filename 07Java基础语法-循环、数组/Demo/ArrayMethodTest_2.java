/*
  ���������: һ�㶼����������,Ԫ��,С���������
  
  ��������ķ�ʽ
     ѡ������: �����ÿ��Ԫ�ض����бȽ�
	 ð������: ����������Ԫ�ؽ��бȽ�
	 ����: �Ƚϴ�С,λ�ý���
*/
public class ArrayMethodTest_2{
	public static void main(String[] args){
		int[] arr  = {3,1,4,2,56,7,0};
		//����ѡ�����򷽷�
		//selectSort(arr);
		
		//����ð�����򷽷�
		bubbleSort(arr);
		printArray(arr);
	}
	/*
	   ���巽��,ʵ�������ð������
	   ����ֵ: û��
		����:  ����
	*/
	public static void bubbleSort(int[] arr){
		for(int i = 0 ; i < arr.length - 1; i++){
			//ÿ����ѭ���ıȽ�,��0������ʼ, ÿ�ζ��ڵݼ�
			for(int j = 0 ; j < arr.length-i-1; j++){
				//�Ƚϵ�����,��j��j+1
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	/*
	    ���巽��,ʵ�������ѡ������
		����ֵ: û��
		����:  ����
		ʵ�ֲ���:
		  1.Ƕ��ѭ��ʵ������
		    ��ѭ��,���Ƶ���һ���Ƚ��˶��ٴ�
			��ѭ��,���Ƶ���ÿ�αȽ��˶��ٸ�Ԫ��
		  2. �ж�Ԫ�صĴ�Сֵ
		    Сֵ,�洢��С������
	*/
	public static void selectSort(int[] arr){
		for(int i = 0 ; i < arr.length - 1; i++){
			//��ѭ��,��ÿ�ζ��ڼ���,�޸ı����Ķ���
			for(int j = i+1 ; j < arr.length ; j++){
				//�����Ԫ�ؽ����ж�
				if(arr[i] > arr[j]){
					//����Ļ�λ
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp; 
				}
			}
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



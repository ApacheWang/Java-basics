/*
    ���������е����ֵ
	����  {4,1,7,5}; ���Ƚ�
*/
public class ArrayDemo_5{
	public static void main(String[] args){
		//��������,int����
		int[] arr = {5,1,12,4,6,8,0,3};
		//�������,��¼������0�����ϵ�Ԫ��
		int max = arr[0];
		
		//��������,��ȡ���е�Ԫ��,�ͱ���max�Ƚ�
		for(int i = 1; i < arr.length ; i++){
			//����max,�������е�ÿ��Ԫ�ؽ��бȽ�
			//���max,С���������е�һ��Ԫ��
			if( max < arr[i] ){
				//�ϴ�������Ԫ��,��ֵ��max
				max = arr[i];
			}
		}
		// �������,����max,�����������ֵ
		System.out.println(max);
	}
}
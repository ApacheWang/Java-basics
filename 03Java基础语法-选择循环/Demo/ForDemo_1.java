/*
     ����forѭ��,����1+4�Ľ��
	 1 + 2 + 3 + 4 = 10
	 
	 1+2�ĺ�+3
	 1+2+3�ĺ�+4
*/
public class ForDemo_1{
	public static void main(String[] args){
		// �������,��¼��ͺ������
		int sum = 0;
		// ����ѭ��,��������1�仯��4
		for(int i = 1 ; i <= 4 ; i++){
			//�Ա����������
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
/*
     ����ѭ��,�����ĸ������дСд,52��
	 ���A-Z  a-z
	 ���ñ����ʵ��,��ĸ�����ֵĶ�Ӧ��ϵ
	 A-Z  65-90
	 a-z  97-122
	 
	 ʵ�ֲ���:
	   1. �������,����Сдa,��дA
	   2. ѭ��26��,�������õı���
	      ÿ��ѭ��,����++ 
*/
public class LoopTest_2{
	public static void main(String[] args){
		//�������,����2����ĸ
		char xiaoXie = 'a';
		char daXie = 'A';
		//����ѭ��,����26��
		for(int i = 0 ; i < 26 ;i++){
			//���������ĸ�ı���
			System.out.println(xiaoXie+"  "+daXie);
			daXie++;
			xiaoXie++;
		}
	}
}
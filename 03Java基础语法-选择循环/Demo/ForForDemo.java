/*
   ѭ����Ƕ��: ѭ�����滹��ѭ��, for��ʽ��
   for(){
	   
	    for(){
			
		}
	   
   }
   �ܵ�ѭ������ =  ��ѭ������ * ��ѭ���Ĵ���
   ��ѭ��,����ѭ����ѭ����
   
   ��ѭ��,���Ƶ�������
   ��ѭ��,���Ƶ���ÿ�еĸ���
*/
public class ForForDemo{
	public static void main(String[] args){
		for(int i = 0 ; i < 9 ; i++){
			for(int j = 0; j < i+1 ;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
/*
   ���������:
     1  �洢����
	 2. Ԥ�������˵�����
	 3. �����һ���˵�����
*/
import java.util.Random;
public class CallName{
	public static void main(String[] args){
		//�洢����,�����洢��������
		//����洢����,��������������,String
		String[] names = {"����","����","����","����","��÷÷","С��","����","С��","Լ��ѷ","����˿"};
		
		//Ԥ��: ��������,��ӡ��������
		for(int i = 0 ; i < names.length ; i++){
			System.out.println(names[i]);
		}
		System.out.println("=============");
		
		//�����һ���˵���
		//���������,����һ������,��Ϊ����,���������ҵ���Ӧ��Ԫ��
		Random ran = new Random();
		//�����,��Χ������0-������������
		int index = ran.nextInt(names.length);//index ���������,��Ϊ����
		System.out.println(names[index]);
	}
}
/*
   switch����: case ��͸��
   ����: ����1-5��� ������ , ����6-7  �����Ϣ��
   case 1 case 2... case5 ��������ͬ
   
   case ����ĳ���,��switch��������ͬ ,û��break,һֱ���´�͸
   case ����û��break, ����ͻ�һֱ���´�͸
*/
public class SwitchDemo_1{
	public static void main(String[] args){
		int week = 30;
		
		switch(week){
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			  System.out.println("������");
			break;
			
			case 6:
			case 7:
			  System.out.println("��Ϣ��");
			break;
		}
	}
}
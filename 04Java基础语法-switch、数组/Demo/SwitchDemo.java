/*
   ѡ�����  switch���
   ��д��ʽ
      swtich(���ʽ){
		  case ����1 :
		    Ҫִ�е����;
		  break;
		  
		  case ����2 :
		    Ҫִ�е����;
		  break;
		  
		  case ����3 :
		    Ҫִ�е����;
		  break;
		  
		  default:
		    Ҫִ�е����;
		  break;
	  }
	  ִ������:  ���ʽ,��case����ĳ������бȽ�
	  ���ĸ�case��ĳ�����ͬ,��ִ���ĸ�case����ĳ���,����break,��ȫ����
	  
	  �ؼ���: switch case default break
	  
	�������1�����������һ
	�������2����������ڶ�
	�������3�������������
	�������4�������������
	�������5�������������
	�������6�������������
	�������7�������������
	
	switch����еı��ʽ����������,����Ҫ���
	JDK1.0 - 1.4  �������ͽ��� byte short int char
	JDK1.5   �������ͽ��� byte short int char enum(ö��)
	JDK1.7   �������ͽ��� byte short int char enum(ö��), String
*/
public class SwitchDemo{
	public static void main(String[] args){
		//�������,�������ڼ�������
		int week = 13;
		//switch���
		switch(week){
			case 1:
			  System.out.println("����һ");
			break;
			
			case 2:
			  System.out.println("���ڶ�");
			break;
			
			case 3:
			  System.out.println("������");
			break;
			
			case 4:
			  System.out.println("������");
			break;
			
			case 5:
			  System.out.println("������");
			break;
			
			case 6:
			  System.out.println("������");
			break;
			
			case 7:
			  System.out.println("������");
			break;
			
			default:
			  System.out.println("���ڲ�����");
			break;
		}
	}
}







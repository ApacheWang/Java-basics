/*
   if  else if else ���
   �ʺ��ڳ�����,ʵ�ֶ��������ж�
   ��д��ʽ:
     if(����){
		 if ִ����
	 }else if(����){
		 if ִ����
	 }else if(����){
		 if ִ����
	 }else{
		 else��ִ����
	 }
	 ��if�е�������true,ִ��ifִ����
	 if�е�������false,ִ��elseִ����
	 һ�������,������� if , ֻҪ��1��if��������true,�����Ĵ���,����ִ��
*/
public class IfElseIfDemo{
	public static void main(String[] args){
		//�ɼ��ж�Ҫ�� ,�ɼ�>80  �ɼ�>70  �ɼ�>60  ������
		//�������,����ɼ�
		int grade = 75;
		//ʹ��if else if ���Գɼ��ж�
		if( grade > 80 ){
			System.out.println(grade+" �ɼ�����");
		}else if ( grade > 70){
			System.out.println(grade+" �ɼ�����");
		}else if ( grade > 60){
			System.out.println(grade+" �ɼ�����");
		}else{
			System.out.println(grade+" �ɼ��ǲ�");
		}
		
		/*
		  ִ��Ч�ʵ�
		if( grade > 80){
			//��
		}
		
		if( grade > 70 && grade < 80){
			//��
		}
		
		if( grade > 60){
			//��
		}*/
	}
}







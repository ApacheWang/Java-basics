/*
    if���:
	  ��д��ʽ
	  
	  if(����){
		  if����ִ����
	  }
	  ����: ��������ǲ�������  1==1   true||false
	  ִ����: ��if�е�����Ϊtrue��ʱ��,ִ�д������е�ִ����
	          if������false��ʱ��,ʲôҲ����
*/
public class IfDemo{
	public static void main(String[] args){
		  int i = 5 ;
		  //�Ա���i����if�ж�
		  if(i > 5){
			  System.out.println("if�е�������true");
			  i++;
		  }
		  
		  System.out.println(i);
	}
}
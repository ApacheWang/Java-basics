package cn.itast.demo08;
/*
 *  �ֲ��ڲ���
 *    ��һ����,�����ڷ�����
 */
public class Outer {
    
	public void out(){
		 class Inner {
			 public void inner(){
				 System.out.println("�ֲ��ڲ��෽��");
			 }
		 } 
		 Inner in = new Inner();
		 in.inner();
    }
    
}

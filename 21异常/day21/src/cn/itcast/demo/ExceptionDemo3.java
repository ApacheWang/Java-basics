package cn.itcast.demo;
/*    try{
*        �����Ĵ���
*        ���ܳ����쳣�Ĵ���
*      }catch(�쳣���� ����){
*         �쳣�Ĵ���ʽ
*         ѭ��,�ж�,���÷���,����
*      }finally{
*         ����Ҫִ�д���
*      }
*      finally,���۳����Ƿ����쳣����,�������ִ��
*      �ͷ���Դ
*/
public class ExceptionDemo3 {
	public static void main(String[] args) {
		try{
			function(0);
		}catch(Exception ex){
			System.out.println(ex);
		
		}finally{
			System.out.println("�������ִ��");
		}
	}
	
	public static void function(int a)throws Exception{
		if( a == 0)
			throw new Exception();
		System.out.println(a);
	}
	
}

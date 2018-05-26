package cn.itcast.demo;
/*
 *  �쳣�Ĵ���ʽ:
 *    try...catch...finally
 *    ��ʽ:
 *      try{
 *        �����Ĵ���
 *        ���ܳ����쳣�Ĵ���
 *      }catch(�쳣���� ����){
 *         �쳣�Ĵ���ʽ
 *         ѭ��,�ж�,���÷���,����
 *      }finally{
 *         ����Ҫִ�д���
 *      }
 */
public class ExceptionDemo1 {
	public static void main(String[] args) {
		int[] arr = null;
		try{
			int i = getArray(arr);
			System.out.println(i);
			
		}catch(NullPointerException ex){
			System.out.println("###"+ex);
			
		}catch(ArrayIndexOutOfBoundsException ex){
			
			System.out.println("!!!!!!"+ex);
		}
		System.out.println("Game Over");
	}
	/*
	 * ���巽��,�׳��쳣
	 * ������ʹ��try catch
	 */
	 public static int getArray(int[] arr)throws NullPointerException,ArrayIndexOutOfBoundsException{
		 //�������п�
		 if( arr == null){
			 //�ֶ��׳��쳣,�׳���ָ���쳣
			 throw new NullPointerException("���鲻����");
		 }
		 //����������������ж�
		 if( arr.length < 3){
			 //�ֶ��׳��쳣,�׳����������Խ���쳣
			 throw new ArrayIndexOutOfBoundsException("����û��3����");
		 }
		 return arr[3]+1;
	 }
}





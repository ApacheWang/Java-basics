package cn.itcast.demo;

import java.util.NoSuchElementException;

/*
 *  ��catchд��һ��
 *  ϸ��:
 *    catchС������,д�����쳣�������
 *    ��û��˳��ĸ���,��
 *    
 *    ƽ���쳣: �׳����쳣��֮��,û�м̳й�ϵ,û��˳��
 *      NullPointerException extends RuntimeException
 *      NoSuchElementException extends RuntimeException
 *      ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException extends RuntimeException
 *      
 *    ���¼���ϵ���쳣
 *      NullPointerException extends RuntimeException extends Exception
 *      Խ�߼��ĸ���,д������
 */
public class ExceptionDemo2 {
	public static void main(String[] args) {
		try{
			
		}catch(NullPointerException ex){
			
		}
		catch(Exception ex){
			
		}
	}
	public static void function(int a)throws NullPointerException,Exception{
		if(a == 0){
			throw new NullPointerException();
		}
		if(a == 1){
			throw new Exception();
		}
	}
}

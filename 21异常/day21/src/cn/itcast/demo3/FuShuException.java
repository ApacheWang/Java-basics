package cn.itcast.demo3;
/*
 *  �Զ����쳣
 *    �̳�Exception,���߼̳�RuntimeException
 *    ���췽����,super���쳣��Ϣ,���ݸ�����
 */
public class FuShuException extends RuntimeException{
	public FuShuException(String s){
		super(s);
	}
	
	public FuShuException(){}
}

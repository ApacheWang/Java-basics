package cn.itcast.demo1;
/*
 *  ��ȡ�߳�����,����Thread����
 *    String getName()
 */
public class NameThread extends Thread{
	
	public NameThread(){
		super("Сǿ");
	}
	
	public void run(){
		System.out.println(getName());
	}
}

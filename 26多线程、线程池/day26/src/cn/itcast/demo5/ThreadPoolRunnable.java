package cn.itcast.demo5;

public class ThreadPoolRunnable implements Runnable {
	public void run(){
		System.out.println(Thread.currentThread().getName()+" �߳��ύ����");
	}
}

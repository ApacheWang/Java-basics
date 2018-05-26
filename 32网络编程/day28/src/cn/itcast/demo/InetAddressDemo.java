package cn.itcast.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 *  ��ʾ�������е�IP��ַ
 *    java.net.InetAddress
 *  ��̬����
 *    static InetAddress  getLocalHost()   LocalHost��������
 *    ���ر�������,����ֵInetAddress����
 *    
 *    static InetAddress getByName(String hostName)����������,��ȡIP��ַ����
 *    
 *  �Ǿ�̬����
 *     String getHoustAddress()��ȡ����IP��ַ
 *     String getHoustName()��ȡ������
 *    
 */
public class InetAddressDemo {
	public static void main(String[] args)throws UnknownHostException {
		function_1();
	}
	/*
	 * static InetAddress getByName(String hostName)����������,��ȡIP��ַ����
	 */
	public static void function_1()throws UnknownHostException {
		InetAddress inet = InetAddress.getByName("www.baidu.com");
		System.out.println(inet);
	}
	
	/*
	 *  static InetAddress  getLocalHost()   LocalHost��������
	 */
	public static void function() throws UnknownHostException{
		InetAddress inet = InetAddress.getLocalHost();
		//����������������,�� IP��ַ
		System.out.println(inet.toString());
		
		String ip = inet.getHostAddress();
		String name = inet.getHostName();
		System.out.println(ip+"   "+name);
		
		/*String host = inet.toString();
		String[] str = host.split("/");
		for(String s : str){
			System.out.println(s);
		}*/
	}
}






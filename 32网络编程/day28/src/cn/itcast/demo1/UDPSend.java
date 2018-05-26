package cn.itcast.demo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 *  ʵ��UDPЭ��ķ��Ͷ�:
 *    ʵ�ַ�װ���ݵ��� java.net.DatagramPacket  ��������ݰ�װ
 *    ʵ�����ݴ������ java.net.DatagramSocket  �����ݰ�����ȥ
 *    
 *  ʵ�ֲ���:
 *    1. ����DatagramPacket����,��װ����, ���յĵ�ַ�Ͷ˿�
 *    2. ����DatagramSocket
 *    3. ����DatagramSocket�෽��send,�������ݰ�
 *    4. �ر���Դ
 *    
 *    DatagramPacket���췽��:
 *      DatagramPacket(byte[] buf, int length, InetAddress address, int port) 
 *      
 *    DatagramSocket���췽��:
 *      DatagramSocket()�ղ���
 *      ����: send(DatagramPacket d)
 *      
 */
public class UDPSend {
	public static void main(String[] args) throws IOException{
		//�������ݰ�����,��װҪ���͵�����,���ն�IP,�˿�
		byte[] date = "���UDP".getBytes();
		//����InetAddress����,��װ�Լ���IP��ַ
		InetAddress inet = InetAddress.getByName("127.0.0.1");
		DatagramPacket dp = new DatagramPacket(date, date.length, inet,6000);
		//����DatagramSocket����,���ݰ��ķ��ͺͽ��ն���
		DatagramSocket ds = new DatagramSocket();
		//����ds����ķ���send,�������ݰ�
		ds.send(dp);
		//�ر���Դ
		ds.close();
	}
}

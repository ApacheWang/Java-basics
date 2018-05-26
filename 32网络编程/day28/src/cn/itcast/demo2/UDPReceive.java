package cn.itcast.demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 *  ʵ��UDP���ն�
 *  ����ͣЪ�Ľ��ն�
 */
public class UDPReceive {
	public static void main(String[] args)throws IOException {
		//�������ݰ��������DatagramSocket �󶨶˿ں�
		DatagramSocket ds = new DatagramSocket(6000);
		//�����ֽ�����
		byte[] data = new byte[1024];
		//�������ݰ�����,�����ֽ�����
		while(true){
		DatagramPacket dp = new DatagramPacket(data, data.length);
		//����ds����ķ���receive�������ݰ�
		ds.receive(dp);
		
		//��ȡ���Ͷ˵�IP��ַ����
		String ip=dp.getAddress().getHostAddress();
		
		//��ȡ���͵Ķ˿ں�
		int port = dp.getPort();
		
		//��ȡ���յ����ֽڸ���
		int length = dp.getLength();
		System.out.println(new String(data,0,length)+"..."+ip+":"+port);
		}
		//ds.close();
	}
}

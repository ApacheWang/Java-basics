package cn.itcast.demo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 *  ʵ��UDP���ն�
 *    ʵ�ַ�װ���ݰ� java.net.DatagramPacket �����ݽ���
 *    ʵ���������     java.net.DatagramSocket �������ݰ�
 *    
 *  ʵ�ֲ���:
 *     1. ����DatagramSocket����,�󶨶˿ں�
 *         Ҫ�ͷ��Ͷ˶˿ں�һ��
 *     2. �����ֽ�����,���շ���������
 *     3. �������ݰ�����DatagramPacket
 *     4. ����DatagramSocket���󷽷�
 *        receive(DatagramPacket dp)��������,���ݷ������ݰ���
 *     5. ���
 *          ���͵�IP��ַ
 *            ���ݰ�����DatagramPacket����getAddress()��ȡ���Ƿ��Ͷ˵�IP��ַ����
 *            ����ֵ��InetAddress����
 *          ���յ����ֽڸ���
 *            ���ݰ�����DatagramPacket���� getLength()
 *          ���ͷ��Ķ˿ں�
 *            ���ݰ�����DatagramPacket���� getPort()���Ͷ˿�
 *     6. �ر���Դ
 */
public class UDPReceive {
	public static void main(String[] args)throws IOException {
		//�������ݰ��������DatagramSocket �󶨶˿ں�
		DatagramSocket ds = new DatagramSocket(6000);
		//�����ֽ�����
		byte[] data = new byte[1024];
		//�������ݰ�����,�����ֽ�����
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
		ds.close();
	}
}

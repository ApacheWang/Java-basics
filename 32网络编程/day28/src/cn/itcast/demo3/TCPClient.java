package cn.itcast.demo3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 *  ʵ��TCP�ͻ���,���ӵ�������
 *  �ͷ�����ʵ�����ݽ���
 *  ʵ��TCP�ͻ��˳������ java.net.Socket
 *  
 *  ���췽��:
 *      Socket(String host, int port)  ���ݷ�����IP�Ͷ˿ں�
 *      ע��:���췽��ֻҪ����,�ͻ�ͷ�������������,����ʧ��,�׳��쳣
 *      
 *    OutputStream  getOutputStream() �����׽��ֵ������
 *      ����: ���������,�����������
 *      
 *    InputStream getInputStream() �����׽��ֵ�������
 *      ����: �ӷ������˶�ȡ����
 *      
 *    �ͻ��˷��������ݽ���,����ʹ���׽��ֶ���Socket�еĻ�ȡ��IO��,�Լ�new��,����
 */
public class TCPClient {
	public static void main(String[] args)throws IOException {
		//����Socket����,���ӷ�����
		Socket socket = new Socket("127.0.0.1", 8888);
		//ͨ���ͻ��˵��׽��ֶ���Socket����,��ȡ�ֽ������,������д�������
		OutputStream out = socket.getOutputStream();
		out.write("������OK".getBytes());
		
		//��ȡ���������ص�����,ʹ��socket�׽��ֶ����е��ֽ�������
		InputStream in = socket.getInputStream();
		byte[] data = new byte[1024];
		int len = in.read(data);
		System.out.println(new String(data,0,len));
		
		socket.close();
	}
}

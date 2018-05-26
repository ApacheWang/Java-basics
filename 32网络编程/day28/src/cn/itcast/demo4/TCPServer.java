package cn.itcast.demo4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*
 *  TCPͼƬ�ϴ�������
 *   1. ServerSocket�׽��ֶ���,�����˿�8000
 *   2. ����accept()��ȡ�ͻ��˵����Ӷ���
 *   3. �ͻ������Ӷ����ȡ�ֽ�������,��ȡ�ͻ��˷���ͼƬ
 *   4. ����File����,���ϴ��ļ���
 *       �ж��ļ��д���, ����,�ڴ����ļ���
 *   5. �����ֽ������,����Ŀ��File���������ļ���
 *   6. �ֽ�����ȡͼƬ,�ֽ�����ͼƬд�뵽Ŀ���ļ�����
 *   7. ���ϴ��ɹ���д�ͻ���
 *   8. �ر���Դ
 *       
 */
public class TCPServer {
	public static void main(String[] args) throws IOException{
		ServerSocket server = new ServerSocket(8000);
		Socket socket = server.accept();
		//ͨ���ͻ������Ӷ���,��ȡ�ֽ�������,��ȡ�ͻ���ͼƬ
		InputStream in = socket.getInputStream();
		//��Ŀ���ļ��з�װ��File����
		File upload = new File("d:\\upload");
		if(!upload.exists())
			upload.mkdirs();
		
		//��ֹ�ļ�ͬ��������,���¶����ļ�����
		//����:  ����+����ֵ+6λ�����
		String filename="itcast"+System.currentTimeMillis()+new Random().nextInt(999999)+".jpg";
		//�����ֽ������,��ͼƬд�뵽Ŀ���ļ�����                         
		FileOutputStream fos = new FileOutputStream(upload+File.separator+filename);
		//��д�ֽ�����
		byte[] bytes = new byte[1024];
		int len = 0 ;
		while((len = in.read(bytes))!=-1){
			fos.write(bytes, 0, len);
		}
		//ͨ���ͻ������Ӷ����ȡ�ֽ������
		//�ϴ��ɹ�д�ؿͻ���
		socket.getOutputStream().write("�ϴ��ɹ�".getBytes());
		
		fos.close();
		socket.close();
		server.close();
	}
}

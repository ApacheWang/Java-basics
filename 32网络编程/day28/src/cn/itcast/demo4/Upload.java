package cn.itcast.demo4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Upload implements Runnable{
	
	private Socket socket;
	
	public Upload(Socket socket){this.socket=socket;}
	
	public void run() {
		try{
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
		}catch(Exception ex){
			
		}
	}
	
}

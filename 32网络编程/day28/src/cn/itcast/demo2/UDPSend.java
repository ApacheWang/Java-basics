package cn.itcast.demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/*
 * ʵ��UDP����,�����������ʽ
 * �������,���͸����ն�      
 */
public class UDPSend {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		DatagramSocket ds = new DatagramSocket();
		InetAddress inet = InetAddress.getByName("127.0.0.1");
		while(true){
		String message = sc.nextLine();
		/*if("886".equals(message)){
			break;
		}*/
		byte[] date = message.getBytes();
		DatagramPacket dp = new DatagramPacket(date, date.length, inet,6000);
		ds.send(dp);
		}
	//	ds.close();
	}
}

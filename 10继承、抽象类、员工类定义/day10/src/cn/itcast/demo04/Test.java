package cn.itcast.demo04;
/*
 *   �����ֻ���
 *      �����ֻ������,���÷���
 */
public class Test {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.call();
		p.sendMessage();
		p.showNum();
		
		AndroidPhone ap = new AndroidPhone();
		ap.showNum();
		

	}
}

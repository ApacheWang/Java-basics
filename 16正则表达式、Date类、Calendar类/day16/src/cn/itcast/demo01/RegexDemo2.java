package cn.itcast.demo01;

public class RegexDemo2 {
	public static void main(String[] args) {
		checkMail();
	}
	/*
	 *  ����ʼ���ַ�Ƿ�Ϸ�
	 *  ����:
	 *   1234567@qq.com
	 *   mym_ail@sina.com
	 *   nimail@163.com
	 *   wodemail@yahoo.com.cn    
	 *   
	 *   @: ǰ  ������ĸ_ ������������1��
	 *   @: ��  ������ĸ     ������������1��
	 *   .: ���� ��ĸ 
	 *     
	 */
	public static void checkMail(){
		String email ="abc123@sina.com";
		boolean b = email.matches("[a-zA-Z0-9_]+@[0-9a-z]+(\\.[a-z]+)+");
		System.out.println(b);
	}
}

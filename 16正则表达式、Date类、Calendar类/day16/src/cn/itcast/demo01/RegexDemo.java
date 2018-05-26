package cn.itcast.demo01;
/*
 *  ʵ�����������ַ�������ƥ��,ʹ�õ��ַ�����ķ���
 *  String��������������ʽ��صķ���
 *    boolean matches(String ����Ĺ���)
 *    "abc".matches("[a]")  ƥ��ɹ�����true
 *    
 *    String[] split(String ����Ĺ���)
 *    "abc".split("a") ʹ�ù����ַ��������и�
 *     
 *    String replaceAll( String �������,String �ַ���)
 *    "abc0123".repalceAll("[\\d]","#")
 *    ��װ����Ĺ���,�滻�ַ���
 */ 
public class RegexDemo {
	public static void main(String[] args) {
		checkTel();
	}
	
	
	/*
	 *  ����ֻ������Ƿ�Ϸ�
	 *  1��ͷ ������34578  0-9 λ���̶�11λ
	 */
	public static void checkTel(){
		String telNumber = "1335128005";
		//String��ķ���matches
		boolean b = telNumber.matches("1[34857][\\d]{9}");
		System.out.println(b);
	}
	
	/*
	 *  ���QQ�����Ƿ�Ϸ�
	 *  0���ܿ�ͷ,ȫ����, λ��5,10λ
	 *  123456 
	 *  \\d  \\Dƥ�䲻������
	 */
	public static void checkQQ(){
		String QQ = "123456";
		//���QQ����͹����Ƿ�ƥ��,String��ķ���matches
		boolean b = QQ.matches("[1-9][\\d]{4,9}");
		System.out.println(b);
	}
}







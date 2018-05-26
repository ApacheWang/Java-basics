package cn.itcast.demo2;

public class SystemDemo {
	public static void main(String[] args) {
		function_4();
	}
	/*
	 * System�෽��,��������
	 * arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
	 * Object src, Ҫ���Ƶ�Դ����
	 * int srcPos, ����Դ����ʼ����
	 * Object dest,���ƺ��Ŀ������
	 * int destPos,Ŀ��������ʼ���� 
	 * int length, ���Ƽ���
	 */
	public static void function_4(){
		int[] src = {11,22,33,44,55,66};
		int[] desc = {77,88,99,0};
		
		System.arraycopy(src, 1, desc, 1, 2);
		for(int i = 0 ;  i < desc.length ; i++){
			System.out.println(desc[i]);
		}
	}
	
	/*
	 *  ��ȡ��ǰ����ϵͳ������
	 *  static Properties getProperties() 
	 */
	public static void function_3(){
		System.out.println( System.getProperties() );
	}
	
	/*
	 *  JVM���ڴ���,��ȡ���������
	 *  static void gc()
	 */
	public static void function_2(){
		new Person();
		new Person();
		new Person();
		new Person();
		new Person();
		new Person();
		new Person();
		new Person();
		System.gc();
	}
	
	/*
	 *  �˳������,���г���ȫֹͣ
	 *  static void exit(0)
	 */
	public static void function_1(){
		while(true){
			System.out.println("hello");
			System.exit(0);
		}
	}
	/*
	 *  ��ȡϵͳ��ǰ����ֵ
	 *  static long currentTimeMillis()
	 *  �Գ���ִ��ʱ�����
	 */
	public static void function(){
		long start = System.currentTimeMillis();
		for(int i = 0 ; i < 10000; i++){
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}

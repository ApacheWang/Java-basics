package cn.itcast.demo1;
/*
 *   JDK1.5����ֵ�����,�Զ�װ����Զ�����
 *   �Զ�װ��: ������������,ֱ�ӱ�ɶ���
 *   �Զ�����: �����е����ݱ�ػ�����������
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 *  �����Զ�װ��Ͳ���һЩ��Ŀ
	 */
	public static void function_2(){
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i==j);// false �����ַ
		System.out.println(i.equals(j));// true  �̳�Object��дequals,�ȽϵĶ�������
		
		System.out.println("===================");
		
		Integer a = 500;
		Integer b = 500;
		System.out.println(a==b);//false
		System.out.println(a.equals(b));//true
		
		System.out.println("===================");
		
		
		//������byte��Χ��,JVM�������new����
		Integer aa = 127; // Integer aa = new Integer(127)
		Integer bb = 127; // Integer bb = aa;
		System.out.println(aa==bb); //true
		System.out.println(aa.equals(bb));//true
	}
	
	
	//�Զ�װ��Ͳ���׶�,���ܳ��ֿ�ָ���쳣
	public static void function_1(){
	    Integer in =null;	
	    //in = null.intValue()+1
	    in = in + 1;
	    System.out.println(in);
	}
	
	//�Զ�װ��,����� �ô�: �������ͺ�������ֱ������
	public static void function(){
		//�������� , ���ñ���һ��ָ�����
		//�Զ�װ��, ������������1, ֱ�ӱ���˶���
		
		Integer in = 1; // Integer in = new Integer(1)
		//in ����������,���ܺͻ�����������, �Զ�����,��������in,ת����������
		
		//in+1  ==> in.inValue()+1 = 2    
		// in = 2    �Զ�װ��
		in = in + 1;
		
		System.out.println(in);
		
	}
}
/*
    ArrayList<Integer> ar = new ArrayList<Integer>();
    ar. add(1);
 */

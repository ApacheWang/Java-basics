package cn.itcast.demo3;
/*
 * JDK1.5������,��̬����
 * ���ٿ����Ĵ�����
 * ��׼��д��,�������ʱ�����ʹ��
 * 
 * import static java.lang.System.out;��ĩβ,������һ����̬��Ա
 */
import static java.lang.System.out;
import static java.util.Arrays.sort;


public class StaticImportDemo {
	public static void main(String[] args) {
		out.println("hello");
		
		int[] arr = {1,4,2};
		sort(arr);
	}
}

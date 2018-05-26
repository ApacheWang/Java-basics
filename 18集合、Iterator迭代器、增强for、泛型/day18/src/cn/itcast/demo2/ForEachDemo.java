package cn.itcast.demo2;
import java.util.ArrayList;

/*
 *  JDK1.5������,��ǿforѭ��
 *  JDK1.5�汾��,�����µĽӿ� java.lang.Iterable
 *    Collection���Ǽ̳�Iterable
 *    Iterable����,ʵ����ǿforѭ��
 *    
 *    ��ʽ:
 *      for( ��������  ������ : ������߼��� ){
 *         sop(����);
 *      }
 */
import cn.itcast.demo.Person;
public class ForEachDemo {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 *  ��ǿforѭ����������
	 *  �洢�Զ���Person����
	 */
	public static void function_2(){
		ArrayList<Person> array = new ArrayList<Person>();
		array.add(new Person("a",20));
		array.add(new Person("b",10));
		for(Person p : array){
			System.out.println(p);
		}
	}
	
	
	public static void function_1(){
		//for���ڶ������������ʱ��,�ܷ���ö���ķ�����
		String[] str = {"abc","itcast","cn"};
		for(String s : str){
			System.out.println(s.length());
		}
	}
	
	/*
	 *  ʵ��forѭ��,��������
	 *  �ô�: ��������,�������������
	 *  �׶�: û������,���ܲ������������Ԫ��
	 */
	public static void function(){
		int[] arr = {3,1,9,0};
		for(int i : arr){
			System.out.println(i+1);
		}
		System.out.println(arr[0]);
	}
}







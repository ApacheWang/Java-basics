package cn.itcast.demo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 *  ���ϲ����Ĺ�����
 *    Collections
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 * Collections.shuffle����
	 * ��List�����е�Ԫ��,�����������
	 */
	public static void function_2(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(11);
		list.add(8);
		list.add(10);
		list.add(15);
		list.add(20);	
		System.out.println(list);
		
		//���ù����෽��shuffle�Լ����������
		Collections.shuffle(list);
		System.out.println(list);
	}
	
	/*
	 * Collections.binarySearch��̬����
	 * ��List���Ͻ��ж�������,��������,����List����,���ݱ����ҵ�Ԫ��
	 */
	public static void function_1(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(8);
		list.add(10);
		list.add(15);
		list.add(20);
		//���ù����ྲ̬����binarySearch
		int index = Collections.binarySearch(list, 16);
		System.out.println(index);
	}
	
	/*
	 *  Collections.sort��̬����
	 *  ����List����,������������
	 */
	public static void function(){
		//����List����
		List<String> list = new ArrayList<String>();
		list.add("ewrew");
		list.add("qwesd");
		list.add("Qwesd");
		list.add("bv");
		list.add("wer");
		System.out.println(list);
		//���ü��Ϲ�����ķ���sort
		Collections.sort(list);
		System.out.println(list);
	}
}

package cn.itcast.demo;

import java.util.LinkedList;

/*
 *  LinkedList �����ϵ����й���
 *    �����ص�: ����ײ�ʵ��,��ѯ��,��ɾ��
 *  
 *  ��������й���,���ܶ�̬����
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		function_3();
	}
	/*
	 *  E removeFirst() �Ƴ�����������Ŀ�ͷ
	 *  E removeLast() �Ƴ�����������Ľ�β
	 */
	public static void function_3(){
		LinkedList<String> link = new LinkedList<String>();
		link.add("1");
		link.add("2");
		link.add("3");
		link.add("4");
		
		String first = link.removeFirst();
		String last = link.removeLast();
		System.out.println(first);
		System.out.println(last);
	
		System.out.println(link);
	}
	
	/*
	 * E getFirst() ��ȡ����Ŀ�ͷ
	 * E getLast() ��ȡ����Ľ�β
	 */
	public static void function_2(){
		LinkedList<String> link = new LinkedList<String>();
		link.add("1");
		link.add("2");
		link.add("3");
		link.add("4");
	
		if(!link.isEmpty()){
			String first = link.getFirst();
			String last = link.getLast();
			System.out.println(first);
			System.out.println(last);
		}
	}
	
	public static void function_1(){
		LinkedList<String> link = new LinkedList<String>();
		link.addLast("a");
		link.addLast("b");
		link.addLast("c");
		link.addLast("d");
		
		link.addFirst("1");
		link.addFirst("2");
		link.addFirst("3");
		System.out.println(link);
	}
	
	/*
	 *  addFirst(E) ��ӵ�����Ŀ�ͷ
	 *  addLast(E) ��ӵ�����Ľ�β
	 */
	public static void function(){
		LinkedList<String> link = new LinkedList<String>();
		
		link.addLast("heima");
		
		link.add("abc");
		link.add("bcd");
		
		link.addFirst("itcast");
		System.out.println(link);
		
		
	}
}

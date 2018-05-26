package cn.itcast.demo;

import java.util.ArrayList;
import java.util.Collection;

/*
 *  Collection�ӿ��еķ���
 *  �Ǽ���������ʵ�������ӵ�еķ���
 *  ʹ��Collection�ӿڵ�ʵ����,�������ʾ
 *  ArrayList implements List
 *  List extends Collection
 *  ������ִ��,����ʵ�ֵ���д
 */
public class CollectionDemo {
	public static void main(String[] args) {
		function_3();
	}
	/*
	 * Collection�ӿڷ���
	 * boolean remove(Object o)�Ƴ�������ָ����Ԫ��
	 */
	private static void function_3(){
		Collection<String> coll = new ArrayList<String>();
		coll.add("abc");
		coll.add("money");
		coll.add("itcast");
		coll.add("itheima");
		coll.add("money");
		coll.add("123");	
		System.out.println(coll);
		
		boolean b = coll.remove("money");
		System.out.println(b);
		System.out.println(coll);
	}
	
	/*  Collection�ӿڷ���
	 *  Object[] toArray() �����е�Ԫ��,ת��һ�������е�Ԫ��, ����ת������
	 *  ������һ���洢���������, ����洢������������Object
	 */
	private static void function_2() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("abc");
		coll.add("itcast");
		coll.add("itheima");
		coll.add("money");
		coll.add("123");
		
		Object[] objs = coll.toArray();
		for(int i = 0 ; i < objs.length ; i++){
			System.out.println(objs[i]);
		}
	}
	/*
	 * ѧϰJava�����ֳ��ȱ�����ʽ
	 *   ����.length ����  ����ֵ int
	 *   �ַ���.length() ����,����ֵint
	 *   ����.size()����, ����ֵint
	 */
	
	/*
	 * Collection�ӿڷ���
	 * boolean contains(Object o) �ж϶����Ƿ�����ڼ�����,������ڷ���true
	 * ����������Object����
	 */
	private static void function_1() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("abc");
		coll.add("itcast");
		coll.add("itheima");
		coll.add("money");
		coll.add("123");
		
		boolean b = coll.contains("itcast");
		System.out.println(b);
	}


	/*
	 * Collection�ӿڵķ���
	 * void clear() ��ռ����е�����Ԫ��
	 * ��������������Ȼ����
	 */
	public static void function(){
		//�ӿڶ�̬�ķ�ʽ����
		Collection<String> coll = new ArrayList<String>();
		coll.add("abc");
		coll.add("bcd");
		System.out.println(coll);
		
		coll.clear();
		
		System.out.println(coll);
		
	}
}

package cn.itcast.demo4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
 *  ���͵�ͨ���
 */
public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		array.add("123");
		array.add("456");
		
		set.add(789);
		set.add(890);
		
		iterator(array);
		iterator(set);
	}
	/*
	 *  ���巽��,����ͬʱ����2������
	 *  ����: ��ôʵ�� , ����дArrayList,Ҳ����дHashSet
	 *  ����: ���߹�ͬʵ�ֵĽӿ�
	 *  ���͵�ͨ��,ƥ�����е���������  ?
	 */
	public static void iterator(Collection<?> coll){
		Iterator<?> it = coll.iterator();
		while(it.hasNext()){
			//it.next()��ȡ�Ķ���,ʲô����
			System.out.println(it.next());
		}
	}
}

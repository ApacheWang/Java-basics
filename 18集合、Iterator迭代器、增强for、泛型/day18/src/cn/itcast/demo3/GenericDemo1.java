package cn.itcast.demo3;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *  ���з��͵���
 *    ArrayList
 *    E: Element Ԫ��, ʵ��˼�����һ���������� 
 *    ArrayList<Integer> , E ���ܵ�����,����Integer����
 *    public class ArrayList<E>{
 *    
 *       public boolean add(Integer e){
 *          elementData[size++] = e;
 *       }
 *       
 *       public boolean add(E e){}
 *    }
 *    
 *    Iterator<E> 
 *    E next()
 *    
 *    Iterator<Integer> 
 *    Integer next()
 *   
 */
public class GenericDemo1 {
	public static void main(String[] args) {
		ArrayList<Integer>  array = new ArrayList<Integer> ();
		array.add(123);
		array.add(456);
		// ArrayList����,�Լ��и�����
		// <T> T[] toArray(T[] a) 
		Integer[] i = new Integer[array.size()];
		Integer [] j = array.toArray(i);
		for(Integer k : j){
			System.out.println(k);
		}

	}
}

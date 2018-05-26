package cn.itcast.demo1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 *  Set�ӿ�,�ص㲻�ظ�Ԫ��,û����
 *  
 *  Set�ӿڵ�ʵ����,HashSet (��ϣ��)
 *  �ص�: ���򼯺�,�洢��ȡ����˳��ͬ,û������,���洢�ظ�Ԫ��
 *  ����ı�д��,��ArrayList��ȫһ��
 */
public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("cn");
		set.add("heima");
		set.add("java");
		set.add("java");
		set.add("itcast");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("==============");
		
		for(String s : set){
			System.out.println(s);
		}
	}
}




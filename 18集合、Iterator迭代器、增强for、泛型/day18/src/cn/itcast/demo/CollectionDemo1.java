package cn.itcast.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {
	public static void main(String[] args) {
		//���Ͽ��Դ洢�������͵Ķ���
		//������,��ָ���洢����������, ����ʲô����
		Collection coll = new ArrayList();
		coll.add("abc");
		coll.add("uyjgtfd");
		
		//��������ȡ
		Iterator it = coll.iterator();
		while(it.hasNext()){
			//it.next()��ȡ��������ʲô��������,Object��
			//Object obj = it.next();
			//System.out.println(obj);
			String s = (String)it.next();
			System.out.println(s.length());
		}
	}
}

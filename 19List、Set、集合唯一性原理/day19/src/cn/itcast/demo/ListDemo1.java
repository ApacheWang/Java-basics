package cn.itcast.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 *  �������Ĳ����޸��쳣 java.util.ConcurrentModificationException
 *  �����ڱ����Ĺ�����,ʹ���˼��Ϸ����޸��˼��ϵĳ���,�������
 */
public class ListDemo1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		
		//�Լ���ʹ�õ��������л�ȡ,��ȡʱ���жϼ������Ƿ���� "abc3"����
		//�����,���һ��Ԫ�� "ABC3"
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			//�Ի�ȡ����Ԫ��s,�����ж�,�ǲ�����"abc3"
			if(s.equals("abc3")){
				list.add("ABC3");
			}
			System.out.println(s);
		}
	}
}

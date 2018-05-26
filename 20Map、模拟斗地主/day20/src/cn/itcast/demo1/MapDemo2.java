package cn.itcast.demo1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 *  Map���ϻ�ȡ��ʽ
 *  entrySet����,��ֵ��ӳ���ϵ(���֤)��ȡ
 *  ʵ�ֲ���:
 *    1. ����map���Ϸ���entrySet()�������е�ӳ���ϵ����,�洢��Set����
 *        Set<Entry <K,V> >
 *    2. ����Set����
 *    3. ��ȡ����Set���ϵ�Ԫ��,��ӳ���ϵ����
 *    4. ͨ��ӳ���ϵ���󷽷� getKet, getValue��ȡ��ֵ��
 *    
 *    �����ڲ������ �ⲿ��.�ڲ��� = new 
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1, "abc");
		map.put(2, "bcd");
		map.put(3, "cde");
		//1. ����map���Ϸ���entrySet()�������е�ӳ���ϵ����,�洢��Set����
		Set<Map.Entry <Integer,String> >  set = map.entrySet();
		//2. ����Set����
		Iterator<Map.Entry <Integer,String> > it = set.iterator();
		while(it.hasNext()){
			//  3. ��ȡ����Set���ϵ�Ԫ��,��ӳ���ϵ����
			// it.next ��ȡ����ʲô����,Ҳ��Map.Entry����
			Map.Entry<Integer, String> entry = it.next();
			//4. ͨ��ӳ���ϵ���󷽷� getKet, getValue��ȡ��ֵ��
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"...."+value);
		}
		
		System.out.println("=========================");
		for(Map.Entry<Integer, String> entry : map.entrySet()){
			System.out.println(entry.getKey()+"..."+entry.getValue());
		}
	}
}

package cn.itcast.demo1;

import java.util.HashMap;
import java.util.Map;

/*
 *  Map�ӿ��еĳ��÷���
 *    ʹ��Map�ӿڵ�ʵ���� HashMap
 */
public class MapDemo {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 *  �Ƴ������еļ�ֵ��,���ر��Ƴ�֮ǰ��ֵ
	 *  V remove(K)
	 */
	public static void function_2(){
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		System.out.println(map);
		
		String value = map.remove(33);
		System.out.println(value);
		System.out.println(map);
	}
	
	/*
	 * ͨ��������,��ȡֵ����
	 * V get(K)
	 * ���������û�������,����null
	 */
	public static void function_1(){
		//�������϶���,��Ϊ���Ķ�������,ֵ�Ķ���洢�ַ���
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		System.out.println(map);
		
		String value = map.get(4);
		System.out.println(value);
	}
	
	/*
	 *  ����ֵ�Դ洢��������
	 *  V put(K,V) K ��Ϊ���Ķ���, V��Ϊֵ�Ķ���
	 *  �洢�����ظ��ļ�,��ԭ�е�ֵ,����
	 *  ����ֵһ������·���null,
	 *  �洢�ظ�����ʱ��,���ر�����֮ǰ��ֵ
	 */
	public static void function(){
		//�������϶���,HashMap,�洢����,�����ַ���,ֵ������
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		
		map.put("b", 2);
		
		map.put("c", 3);
		
		System.out.println(map);
	}
}

package cn.itcast.demo1;

import java.util.LinkedHashSet;

/*
 *   LinkedHashSet ��������Ĺ�ϣ��ʵ��
 *   �̳���HashSet
 *   
 *   LinkedHashSet ��������,����˳��,�洢��ȡ����˳����ͬ��
 *   �̲߳���ȫ�ļ���,�����ٶȿ�
 */
public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		LinkedHashSet<Integer> link = new LinkedHashSet<Integer>();
		link.add(123);
		link.add(44);
		link.add(33);
		link.add(33);
		link.add(66);
		link.add(11);
		System.out.println(link);
	}
}

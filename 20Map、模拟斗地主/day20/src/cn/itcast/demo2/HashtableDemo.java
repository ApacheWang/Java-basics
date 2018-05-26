package cn.itcast.demo2;

import java.util.Hashtable;
import java.util.Map;

/*
 *  Map�ӿ�ʵ���� Hashtable
 *  �ײ����ݽ����ϣ��,�ص��HashMap��һ����
 *  Hashtable �̰߳�ȫ����,�����ٶ���
 *  HashMap �̲߳���ȫ�ļ���,�����ٶȿ�
 *  
 *  Hashtable���˺�Vector��һ����,��JDK1.2��ʼ,�����Ƚ���HashMapȡ��
 *  
 *  HashMap ����洢nullֵ,null��
 *  Hashtable ������洢nullֵ,null��
 *  
 *  Hashtable���ĺ���,���� Properties ��Ȼ��Ծ�ڿ�����̨
 */
public class HashtableDemo {
	public static void main(String[] args) {
		Map<String,String> map = new Hashtable<String,String>();
		map.put(null, null);
		System.out.println(map);
	}
}

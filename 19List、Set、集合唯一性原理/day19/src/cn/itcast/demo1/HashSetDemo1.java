package cn.itcast.demo1;

import java.util.HashSet;

import cn.itcast.demo3.Person;

/*
 *  HashSet���ϵ������ص�:
 *    �ײ����ݽṹ,��ϣ��
 *    �洢,ȡ�����ȽϿ�
 *    �̲߳���ȫ,�����ٶȿ�
 */
public class HashSetDemo1 {
	public static void main(String[] args) {
		/*HashSet<String> set = new HashSet<String>();
		set.add(new String("abc"));
	    set.add(new String("abc"));
		set.add(new String("bbc"));
		set.add(new String("bbc"));
		System.out.println(set);*/
		
		
		//��Person�����е�����,����,��ͬ����,����ͬһ������
		//�ж϶����Ƿ��ظ�,���������Լ��ķ��� hashCode,equals
		HashSet<Person> setPerson = new HashSet<Person>();
		setPerson.add(new Person("a",11));
		setPerson.add(new Person("b",10));
		setPerson.add(new Person("b",10));
		setPerson.add(new Person("c",25));
		setPerson.add(new Person("d",19));
		setPerson.add(new Person("e",17));
		System.out.println(setPerson);
	}
}

package cn.itcast.demo;

import java.util.ArrayList;
/*
 *  ������ϵ,
 *    Ŀ��  ���ϱ�����һ���洢������:
 *       ����ʹ�ü��ϴ洢����
 *       ��������,ȡ������
 *       �����Լ�������
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		/*
		 *  ����ArrayList,�洢int������
		 *  ���ϱ������ܻ�����,�Զ�װ��洢
		 */
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(11);
		array.add(12);
		array.add(13);
		array.add(14);
		array.add(15);
		for(int i = 0 ; i < array.size() ;i++){
			System.out.println(array.get(i));
		}
		/*
		 *  ���ϴ洢�Զ����Person��Ķ���
		 */
		ArrayList<Person> arrayPer = new ArrayList<Person>();
		arrayPer.add(new Person("a",20));
		arrayPer.add(new Person("b",18));
		arrayPer.add(new Person("c",22));
		for(int i = 0 ; i < arrayPer.size();i++){
			//get(0),ȡ���Ķ���Person����
			//��ӡ����һ������,������õ�toString()
			System.out.println(arrayPer.get(i));
		}
	}
}

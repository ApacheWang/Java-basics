package cn.itcast.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 *  �����еĵ�����:
 *    ��ȡ������Ԫ�ط�ʽ
 *  �ӿ� Iterator : �������󷽷�
 *     boolean hasNext() �жϼ����л���û�п��Ա�ȡ����Ԫ��,����з���true
 *     next() ȡ�������е���һ��Ԫ��
 *     
 *  Iterator�ӿ�,��ʵ����.
 *    Collection�ӿڶ��巽�� 
 *       Iterator  iterator()
 *    ArrayList ��д���� iterator(),������Iterator�ӿڵ�ʵ����Ķ���
 *    ʹ��ArrayList���ϵĶ���
 *     Iterator it = array.iterator(),���н������Iterator�ӿڵ�ʵ����Ķ���
 *     it�ǽӿڵ�ʵ�������,���÷��� hasNext �� next ����Ԫ�ص���
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		//������,�Լ���ArrayList�е�Ԫ�ؽ���ȡ��
		
		//���ü��ϵķ���iterator()��ȡ��,Iterator�ӿڵ�ʵ����Ķ���
		Iterator<String> it = coll.iterator();
		//�ӿ�ʵ�������,���÷���hasNext()�жϼ������Ƿ���Ԫ��
		//boolean b = it.hasNext();
		//System.out.println(b);
		//�ӿڵ�ʵ�������,���÷���next()ȡ�������е�Ԫ��
		//String s = it.next();
		//System.out.println(s);
		
		//�����Ƿ�������,ʹ��ѭ��ʵ��,ѭ��������,������ûԪ��, hasNext()������false
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		
		/*for (Iterator<String> it2 = coll.iterator(); it2.hasNext();  ) {
			System.out.println(it2.next());
		}*/
		
	}
}

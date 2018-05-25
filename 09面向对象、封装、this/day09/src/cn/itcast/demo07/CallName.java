package cn.itcast.demo07;

import java.util.ArrayList;
import java.util.Random;

/*
 *  �������������
 *   1. ��������,��Student����洢��������
 *   2. ��������ѧ������Ϣ
 *       ���洢�������е�Student�����������
 *   3. ���ѧ��
 *       �����,��Ϊ����,��������ȥ����Ԫ��
 */
public class CallName {
	public static void main(String[] args) {
		//���弯��ArrayList,�洢Student����
		ArrayList<Student> array = new ArrayList<Student>();
		addStudent(array);
		printStudent(array);
		randomStudent(array);
	}
	/*
	 * ���������ѧ����Ϣ
	 */
	public static void randomStudent(ArrayList<Student> array){
		Random r = new Random();
		int index = r.nextInt(array.size());
		Student s = array.get(index);
		System.out.println(s.getName());
	}
	
	/*
	 * ���巽��,����ѧ����Ϣ
	 * ��������
	 */
	public static void printStudent(ArrayList<Student> array){
		for(int i = 0 ; i < array.size();i++){
			Student s = array.get(i);
			System.out.println(s.getName()+"..."+s.getAge());
		}
	}
	
	/*
	 * ���巽��,�洢Student����,��������
	 */
	public static void addStudent(ArrayList<Student> array){
		Student s1 = new Student();
		s1.setName("lisi1");
		s1.setAge(151);
		
		Student s2 = new Student();
		s2.setName("lisi2");
		s2.setAge(152);
		
		Student s3 = new Student();
		s3.setName("lisi3");
		s3.setAge(153);
		
		Student s4 = new Student();
		s4.setName("lisi4");
		s4.setAge(154);
		
		Student s5 = new Student();
		s5.setName("lisi5");
		s5.setAge(155);
		
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
	}
}

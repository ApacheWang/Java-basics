/*
   ���������,���ϸĽ� (ѧ��������������)
   ��ʵ����ѧ���������,ʹ�ö��������ʽ,����ѧ������
   ����: ����,����
   
   �����洢������, �����������Ǽ���
   String[] s = {"",""};
   ������,�洢����ѧ����������?  Ӧ�ô洢Student����
   
   �洢ѧ��:
      ѧ������,�洢��������
   ����: ��������
   ���: �����,��Ϊ����,���������ҵ�Ԫ��
   ��������,���������,��������,
   ������������,����������ݼ���
*/
import java.util.ArrayList;
import java.util.Random;
public class CallName{
	public static void main(String[] args){
		//���弯��,�洢����StudentName���ͱ���
		ArrayList <StudentName> array = new ArrayList<StudentName>();
		//������ӷ���
		add (array);
		//���ñ�������
		printArrayList(array);
		
		randomStudentName(array);
	}
	/*
	  �����,�������ϵ�����,���������ҵ�Ԫ��
	*/
	public static void randomStudentName(ArrayList<StudentName> array ){
		Random r = new Random();
		int number = r.nextInt( array.size());
		//�����,����,��������get
		StudentName s = array.get(number);
		System.out.println( s.name +"  "+s.age);
	}
	
	/*
	    ����ѧ������Ϣ,��������
	*/
	public static void printArrayList(ArrayList<StudentName> array){
		for(int i = 0 ; i < array.size();i++){
			//�洢���ϵ�ʱ��, ����.add(sn1)  sn1 ��StudentName���ͱ���
			//��ȡ��ʱ��,����.get����,��ȡ��������ʲô, ����StudentName���ͱ���
			StudentName s = array.get(i);
			System.out.println(s.name+"  "+s.age);
		}
	}
	
	/*
	   ���巽��,ʵ�ִ洢ѧ��������������
	   ����StudentName���ͱ���,�洢��������
	*/
	public static void add (ArrayList<StudentName> array){
		//����StudentName���ͱ���
		StudentName sn1 = new StudentName();
		StudentName sn2 = new StudentName();
		StudentName sn3 = new StudentName();
		StudentName sn4 = new StudentName();
		StudentName sn5 = new StudentName();
		
		sn1.name = "����1";
		sn1.age = 201;
		
		sn2.name = "����2";
		sn2.age = 202;
		
		sn3.name = "����3";
		sn3.age = 203;
		
		sn4.name = "����4";
		sn4.age = 204;
		
		sn5.name = "����5";
		sn5.age = 205;
		
		//��StudentName����,�洢��������
		array.add(sn1);
		array.add(sn2);
		array.add(sn3);
		array.add(sn4);
		array.add(sn5);
	}
}




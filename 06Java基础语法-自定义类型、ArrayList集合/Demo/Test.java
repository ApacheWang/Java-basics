/*
   ����Ĳ�����
     ͬʱ����,�緹��,����,ѧ��
*/
public class Test{
	public static void main(String[] args){
		//�����緹����������
		DianFanGuo dfg = new DianFanGuo();
		
		dfg.brand = "��˹��";
		dfg.color = "��ɫ";
		dfg.size = 30;
		
		System.out.println(dfg.brand+"  "+dfg.color+"  "+dfg.size);
		
		//����������������
		Car c = new Car();
		c.brand = "����";
		c.type = "������";
		c.paiLiang = 0.5;
		
		System.out.println(c.brand+"  "+c.type+"  "+c.paiLiang);
		
		//����ѧ����������
		Student stu = new Student();
		stu.name = "����";
		stu.age = 20;
		stu.sex = '��';
		System.out.println(stu.name+"  "+stu.age+"  "+stu.sex);
		
	}
}
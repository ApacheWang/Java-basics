package cn.itcast.demo01;

public class Test {
	public static void main(String[] args) {
		//�����з�Ա����Ķ���
		Develop d = new Develop();
		//����Ķ���,d �ܷ���ø����еĳ�Ա��
		d.name = "����";
		d.print();
		d.work();
		
		//����ά��Ա����Ķ���
		WeiHu w = new WeiHu();
		w.name = "����";
		w.print();
		w.work();
	}
}

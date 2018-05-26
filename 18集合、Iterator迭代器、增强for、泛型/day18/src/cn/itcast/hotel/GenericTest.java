package cn.itcast.hotel;
/*
 *  ���ľƵ�Ա��,��ʦ,����Ա,����,�ֱ�洢��3��������
 *  ���巽��,����ͬʱ����3����,�����������ϵ�ͬʱ,���Ե��ù�������
 */
import java.util.ArrayList;
import java.util.Iterator;
public class GenericTest {
	public static void main(String[] args) {
		//����3�����϶���
		ArrayList<ChuShi> cs = new ArrayList<ChuShi>();
		ArrayList<FuWuYuan> fwy = new ArrayList<FuWuYuan>();
		ArrayList<JingLi> jl = new ArrayList<JingLi>();
		
		//ÿ�����ϴ洢�Լ���Ԫ��
		cs.add(new ChuShi("����", "���001"));
		cs.add(new ChuShi("����", "���002"));
		
		fwy.add(new FuWuYuan("�仨", "����001"));
		fwy.add(new FuWuYuan("���", "����002"));
		
		jl.add(new JingLi("С��", "���»�001", 123456789.32));
		jl.add(new JingLi("Сǿ", "���»�002", 123456789.33));
		
//		ArrayList<String> arrayString = new ArrayList<String>();
		iterator(jl);
		iterator(fwy);
		iterator(cs);
	
	}
	/*
	 * ���巽��,����ͬʱ����3����,�����������ϵ�ͬʱ,���Ե��ù������� work
	 * ? ͨ���,������it.next()����ȡ��������Object����,��ô����work����
	 * ǿ��ת��:  it.next()=Object o ==> Employee
	 * ��������: ����,���Դ���Employee����,Ҳ���Դ���Employee������Ķ���
	 * ���͵��޶�  ������,����̶�Employee,���������������?
	 *   ? extends Employee ���Ƶ��Ǹ���, �����޶�, ���Դ���Employee,���������������
	 *   ? super   Employee ���Ƶ�������, �����޶�, ���Դ���Employee,�������ĸ������
	 */
	public static void iterator(ArrayList<? extends Employee> array){
		
		 Iterator<? extends Employee> it = array.iterator();
		 while(it.hasNext()){
			 //��ȡ����next() ��������,��ʲôEmployee
			 Employee e = it.next();
			 e.work();
		 }
	}
}

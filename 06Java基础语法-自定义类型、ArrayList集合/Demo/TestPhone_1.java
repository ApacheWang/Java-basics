/*
    �����ֻ���
	  ����2���ֻ���ı���
*/
public class TestPhone_1{
	public static void main(String[] args){
		//�����ֻ����ͱ���
		Phone p1 = new Phone();
		
		//�ٴδ����ֻ����ͱ���
		Phone p2 = new Phone();
		
		p1.color = "��ɫ";
		p1.brand = "����";
		p1.size = 4.5;
		
		p2.brand = "��Ϊ";
		
		System.out.println(p1.brand);
		System.out.println(p2.brand);
		System.out.println(p2.size);
	}
}
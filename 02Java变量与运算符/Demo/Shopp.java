/*
	ʵ����Ʒ����嵥����
	  ����:
	   1. ʵ�ֱ�ͷ, �ǹ̶�����,ֱ��д������ sop
	   2. ����м�, ��Ʒ����,���ñ�����ʽ �������,�Ҷ���������
	      ������б���
	   3. ���β��, һ�������ݹ̶�
	      ��һ������,��Ʒ���ݽ�����ѧ����,�����
*/
public class Shopp{
	public static void main(String[] args){
		//�����ͷ�̶�����
		System.out.println("----------�̳�����嵥----------");
		System.out.println("Ʒ���ͺ�     �ߴ�    �۸�    �����");
		//�������е����ݱ���
		//Ʒ���ͺ�,String, �ߴ�,�۸� double  ���int
		String macBrand = "MacBookAir";
		double macSize = 13.3;
		double macPrice = 6988.88;
		int    macCount = 5;
		
		String thinkBrand = "ThinkPadT450";
		double thinkSize = 14;
		double thinkPrice = 5999.99;
		int    thinkCount = 10;
		
		String asusBrand = "ASUS-FL5800";
		double asusSize = 15.6;
		double asusPrice = 4999.5;
		int    asusCount = 18;
		//��Ʒ��Ϣ�������д�ӡ,����֮�����һ�����ַ����ո�
		System.out.println(macBrand+"   "+macSize+"    "+macPrice+"   "+macCount);
		System.out.println(thinkBrand+" "+thinkSize+"    "+thinkPrice+"   "+thinkCount);
		System.out.println(asusBrand+"  "+asusSize+"    "+asusPrice+"    "+asusCount);
		
		//����������,������Ʒ����������
		int totalCount = macCount+thinkCount+asusCount;
		//����������Ʒ�����ܽ��,ÿ����Ʒ�۸�*�����
		double totalMoney = macCount*macPrice + thinkCount*thinkPrice + asusCount*asusPrice;
		//������ײ�
		System.out.println("�ܿ����: "+totalCount);
		System.out.println("��Ʒ����ܽ��: "+totalMoney);
	}
}
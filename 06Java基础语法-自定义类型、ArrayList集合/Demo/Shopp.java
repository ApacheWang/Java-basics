/*
    ʵ�ֿ�������:
	  1. �洢��Ʒ��Ϣ
	    �洢��Ʒ���ͱ���
		����Ʒ���͵ı���,�洢��������
		
      2. �鿴����嵥
	    �����Ͻ��б���, ��ȡ�������д洢��Goods���ͱ���
		���ÿһ��Goods���͵�����
		�������: �ܿ��,�ܽ��
		
     3. �޸���Ʒ�Ŀ��
	    ���ϱ��� ,��ȡ�������д洢��Goods���ͱ���
		��������Goods�������count,ֵ�����޸� (��������)
*/
//import java.util.ArrayList;
import java.util.*;
public class Shopp{
	public static void main(String[] args){
		//����ArrayList����,�洢Goods����
		ArrayList<Goods> array = new ArrayList<Goods>();
		//���������Ʒ��Ϣ�ķ���
		addGoods(array);
		//������ѭ����
		while(true){
			//����ѡ���ܵķ���,��ȡ���û�����Ĺ������
			int number = chooseFunction();
			//������ж�,���=1 ����鿴��湦��  = 2 �����޸Ŀ�湦��  =3 ����
			switch(number){
				case 1:
				//����鿴���,���ò鿴���ķ���,���ݴ洢��Ʒ��Ϣ�ļ���
				printStore(array);
				break;
				
				case 2:
				//�����޸Ŀ�湦��,�����޸Ŀ��ķ���,���ݼ���
				update(array);
				break;
				
				case 3:
				return ;
				
				default:
				 System.out.println("�޴˹���");
				 break;
			}
		}
	}
	/*
	  ��������,�޸Ŀ��
	  ���̵�����,��Goods�е�����ֵ,�޸�
	*/
	public static void update(ArrayList<Goods> array){
		Scanner sc = new Scanner(System.in);
		//��������,��ȡ�����е�ÿ��Ԫ��
		for(int i = 0 ;  i < array.size(); i++){
			//���Ϸ���get��ȡ���Ǽ��ϵ�Ԫ��,Ԫ������Goods
			Goods g = array.get(i);
			System.out.println("������"+g.brand+"�Ŀ����");
			//Goods����,count�����޸�
			g.count = sc.nextInt();
		}
	}
	/*
	   ���巽��,ʵ��ѡ��˵�,�û����ݹ���ѡ��˵�
	*/
	public static int chooseFunction(){
		System.out.println("-------------������------------");
		System.out.println("1.�鿴����嵥");
		System.out.println("2.�޸���Ʒ�������");
		System.out.println("3.�˳�");
		System.out.println("������Ҫִ�еĲ�����ţ�");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}
	
	/*
	   ���巽��,�鿴����嵥,��������
	*/
	public static void printStore(ArrayList<Goods> array){
		//�����ͷ
		System.out.println("----------�̳�����嵥----------");
		System.out.println("Ʒ���ͺ�     �ߴ�    �۸�    �����");
		//�������,�����ܿ����,���ܽ��
		int totalCount = 0 ;
		double totalMoney = 0;
		//��������
		for(int i = 0 ; i < array.size(); i++){
			//get(����)��ȡ�������е�Ԫ��,�洢����Goods��,��ȡ��Ҳ��Goods����
			//ʹ��Goods���ͱ���,����get�������
			Goods g = array.get(i);
			System.out.println(g.brand+"   "+g.size+"    "+g.price+"    "+g.count);
			totalCount = totalCount+g.count;
			totalMoney = totalMoney + g.count*g.price;
		}
		System.out.println("�ܿ����: "+totalCount);
		System.out.println("��Ʒ����ܽ��: "+totalMoney);
	}
	
	/*
	   ���巽��,����Ʒ����Ϣ�洢��������
	   ���������з����Ĺ�������,��������
	*/
	public static void addGoods (ArrayList<Goods> array){
		//������Ʒ���ͱ��� Goods���͵ı���
		Goods g1 = new Goods();
		Goods g2 = new Goods();
		g1.brand = "MacBook";
		g1.size = 13.3;
		g1.price = 9999.99;
		g1.count = 3;
		
		g2.brand = "Thinkpad";
		g2.size = 15.6;
		g2.price = 7999.99;
		g2.count = 1;
		
		//Goods���͵ı���,�洢��������
		array.add(g1);
		array.add(g2);
	}
}
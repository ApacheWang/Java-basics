package cn.itcast.abstractclass;

public class GetAnimal {
	/*
	 * ���巽��,�����ķ���ֵ��Animal����
	 * ������,������û�ж����,����ڷ�����return��,����Animal ������Ķ���
	 */
	public Animal getAnimal(int i){
		if(i==0)
			
			return new Cat();
		
		return new Dog();
	}
}

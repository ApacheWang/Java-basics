package cn.itcast.abstractclass;

public class TestReturn {
	public static void main(String[] args) {
		//����GetAnimal��ķ���,getAnimal,����ֵ��Animal
		GetAnimal g = new GetAnimal();
		
		Animal a= g.getAnimal(9);//�����ķ�����Animal����,return new Cat()
		a.eat();
	}
}

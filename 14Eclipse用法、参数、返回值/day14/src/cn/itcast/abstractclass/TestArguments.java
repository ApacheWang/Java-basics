package cn.itcast.abstractclass;
/*
 *  ������������,��Ϊ�����Ĳ������д���
 */
public class TestArguments {
	public static void main(String[] args) {
		//����operatorAnimal,�����������
		Cat c = new Cat();
		operatorAnimal(c);
		
		operatorAnimal( new Dog());
	}
	/*
	 *  ����operatorAnimal,������һ��������
	 *  ���÷���,����Animal���Ͷ���,Animal������û�ж���
	 *  ֻ�ܴ���Animal������Ķ��� (��̬)
	 *  ���Դ���Animal��������������
	 */
	public static void operatorAnimal(Animal a){
		//���ñ���a,���÷���eat
		a.eat();
	}
}

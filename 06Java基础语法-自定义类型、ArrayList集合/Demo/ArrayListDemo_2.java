/*
   ���ϵı���
   ʵ��˼��Ҳ������˼��
   ���ϵ�������0��ʼ,�� size()-1
   ����get(int index)
*/
import java.util.ArrayList;
public class ArrayListDemo_2{
	public static void main(String[] args){
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(121);
		array.add(125);
		array.add(123);
		array.add(120);
		array.add(128);
		
		//�Լ��Ͻ��б���
		//ʹ�÷��� size+get��Ͻ��б���
		for(int i = 0 ; i < array.size(); i++){
			System.out.println( array.get(i) );
		}
	}
}
/*
   ����ArrayList�����Ĳ���
   
     add(int ����,�洢��Ԫ��) ��Ԫ����ӵ�ָ����������
	 set(int ����,�޸ĺ��Ԫ��) ��ָ��������Ԫ��,�����޸�
	 remove(int ����) ɾ��ָ�������ϵ�Ԫ��
	 clear() ��ռ����е�����Ԫ��
*/
import java.util.ArrayList;
public class ArrayListDemo_3{
	public static void main(String[] args){
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		
		//������2��,���Ԫ��7
		array.add(2,7);
		
		//��0�����ϵ�Ԫ��,�޸ĳ�10
		array.set(0,10);
		
		//��4�����ϵ�Ԫ��,ɾ��
		array.remove(4);
		
		array.clear();
		
		//ʹ�÷��� size+get��Ͻ��б���
		for(int i = 0 ; i < array.size(); i++){
			System.out.println( array.get(i) );
		}
	}
}
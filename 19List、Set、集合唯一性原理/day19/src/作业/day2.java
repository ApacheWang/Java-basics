package ��ҵ;

import java.util.ArrayList;
import java.util.List;

import javax.swing.SpringLayout.Constraints;

public class day2 {
public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("a");
	list.add("f");
	list.add("b");
	list.add("c");
	list.add("a");
	list.add("d");
	boolean  b = Constraints(list,"d");
	
}

private static boolean Constraints(List<String> list, Object obj) {
	/*˼·:
		��һ��������
		�ڶ������ʹ�������ݽ��жԱȣ���� ������������true������� �������� ����false*/
		if(obj== null){
			for (String str : list) {
				if(str==obj){
					return true;
				}
			
			}
		}else {
			//˵������null
			for (String str : list) {
				if(str.equals(obj))
				return true;
			}
		}
		return false;
}
}

package ��ҵ;

public class Person {


		public static void main(String[] args) {
		    String str = "goOd gooD stUdy dAy dAy up";
		    
		    //ȫ��ת��Сд
		    str = str.toLowerCase();
		    
		    //��ȡ�ո�������
		    String[] strArr = str.split(" ");
		    
		    //ƴ���ַ���
		    String sysoStr = ""; 
		    for(String s : strArr){
		    	s = s.substring(0, 1).toUpperCase()+s.substring(1, s.length());
		    	sysoStr += s+" ";
		    }
		    
		    //��ȥ�����һ��û�õĿո�
		    sysoStr = sysoStr.substring(0, sysoStr.length()-1);
		    
		    System.out.println(sysoStr);
		}

	}


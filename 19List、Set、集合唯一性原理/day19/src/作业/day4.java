package ��ҵ;

public class day4 {

		public static void main(String[] args) {
			String str =  "goOd gooD stUdy dAy dAy up";
			
			function(str);
			System.out.println(function(str));
		}

		private static String function(String str) {
			
			String[] arr =str.split(" ");//��str�ַ�����" "Ϊ���ȡΪ����ַ�������
			StringBuilder sb =new StringBuilder();//����StringBuilder����
			for (int i = 0; i < arr.length; i++) {//��������
				
				StringBuilder sb2 =new StringBuilder(arr[i].toLowerCase());
				
				sb2.replace(0, 1, sb2.substring(0, 1).toUpperCase());
				sb.append(sb2.toString()+" ");
				
			}
			return sb.toString();
			
			
		}
		

			
		}


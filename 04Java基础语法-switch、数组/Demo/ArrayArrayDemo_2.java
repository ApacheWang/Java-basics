/*
  ��ά����ı���
    ��ά������,�洢4��һά����,ÿ��һά����ĳ��Ȳ�ͬ

	����: forѭ��,������ά����
	      ����������, for����һά����

*/
public class ArrayArrayDemo_2{
	public static void main(String[] args){
		int[][] arr = { {1,2,3},{4,5},{6,7,8,9},{0} };
		
		//��ѭ��,������ά����
		for(int i = 0 ; i < arr.length ;i++){
			//��ѭ��,����ÿ��һά���� arr[0] arr[1] arr[i]
			for(int j = 0 ; j < arr[i].length; j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
package cn.itcast.demo03;

public class StringBufferTest {
	public static void main(String[] args) {
		int[] arr = {4,1,4,56,7,8,76};
		System.out.println(toString(arr));
	}
   /*
    * int[] arr = {34,12,89,68};��һ��int[]��Ԫ��ת���ַ��� 
    * ��ʽ [34,12,89,68]
    * String s = "["
    * �������
    *   s+= arr[i];
    *  s+"]"
    *  StringBufferʵ��,��Լ�ڴ�ռ�, String + �ڻ�������,append����
    */
	public static String toString(int[] arr){
		//�����ַ���������
		StringBuffer buffer = new StringBuffer();
		buffer.append("[");
		//�������
		for(int i = 0 ; i < arr.length;i++){
			//�ж��ǲ�����������һ��Ԫ��
			if(i == arr.length-1){
				buffer.append(arr[i]).append("]");
			}else{
				buffer.append(arr[i]).append(",");
			}
		}
		return buffer.toString();
	}
}

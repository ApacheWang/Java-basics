package ��ҵ;

import java.util.Arrays;

public class day3 {
public static void main(String[] args) {
	//��дһ�����ͷ�����ʵ��ָ��λ�õ�����Ԫ�ؽ���
	Integer [] arr = {1,2,3,4,5,6};
	swapEleForArr(arr,1,3);
	reverseEleForAyy(arr);
}

private static<T> void reverseEleForAyy(T [] arr) {
	//{1,2,3,4,5}
	//���б��� ---->���������1/2
	//���н���
	for (int i = 0; i < arr.length/2; i++) {
		T t = arr[i];
		arr[i] = arr[arr.length-1-i];
		arr[arr.length-1-i] = t;
		
	}
}

private static<T> void swapEleForArr(T[] arr, int start, int end) {
	//{1,2,3,4,5,}
	T t = arr[start];
	arr[start] = arr[end];
	arr[end] = t;
	System.out.println(Arrays.toString(arr));
}

}

package cn.itcast.demo1;
/*
 *  �쳣��Ϊ�����쳣������ʱ���쳣
 *    �����쳣: �������׳��쳣�ķ���,���������ʧ��  (try  throws)
 *    �����쳣: �׳����쳣��RuntimeException��,��������������
 *  
 *  �����쳣���ص�:
 *     �����ڲ��׳����쳣�������쳣, new XXXException
 *     ������������,����Ҫthrows���,������,����Ҫ����
 *     ���ԭ��:
 *        �����쳣,���ܷ���,�������������,������Աֹͣ�����޸�Դ����
 *        
 *        �����쳣: һ������,��Ҫ����,�����޸�Դ����, �����쳣һ������,����Ĵ���û��ִ�е�����
 */
public class RuntimeExceptionDemo {
	public static void main(String[] args) {
			double d = getArea(1);
			System.out.println(d);
	}
	
	/*
	 *  ���巽��,����Բ�ε����
	 *  ���ݲ���0,���߸���,�����ʱ��û������
	 *  ����,Υ������ʵ���
	 *  ����С��=0, ֹͣ����,��Ҫ�ڼ�����
	 */
	public static double getArea(double r){
		if(r <= 0)
			throw new RuntimeException("Բ�β�����");
		return r*r*Math.PI;
	}
	
	
	public static void function(){
		int[] arr = {1,2,3};
		//�������5���������ж�,���5��������100,�뽫5�����ϵ�����/2,�������3
		//����������û��
		if(arr[5] > 100){
			arr[5] = arr[5]/2;
		}else{
			arr[5] = arr[5]/3;
		}
	}
}

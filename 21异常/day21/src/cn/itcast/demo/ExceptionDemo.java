package cn.itcast.demo;
/*
 *  �쳣�еĹؼ���
 *    throw,�ڷ����ڲ�,�׳��쳣�Ķ���
 *    throw ����,����дnew ����,�������쳣�Ķ���,������Exception��������
 *    
 *  �����������쳣�ؼ���
 *    throws �����ڷ�����������,�����η���,���ܳ����쳣
 *    ������ߴ���
 *    throws �������д�쳣�������
 *    
 *    ������һ���׳��쳣�ķ���,�����߾ͱ��봦��
 *    ������,����ʧ��
 */
public class ExceptionDemo {
	public static void main(String[] args) throws Exception {
		int[] arr = {};
		int i = getArray(arr);
		System.out.println(i);
	}
	//��������������*2,����
	public static int getArray(int[] arr) throws Exception {
		//�Է����������кϷ��Ե��ж�,�����ж��ǲ���null
		if( arr == null){
			//�׳��쳣����ʽ,���ߵ�����
			//�ؼ��� throw
			throw new Exception("�������鲻����");
		}
		
		//����������ж�,�ж�������,�ǲ�����Ԫ��
		if(arr.length == 0){
			//�׳��쳣����ʽ,���ߵ�����,����û��Ԫ��
			throw new Exception("������û�κ�Ԫ��");
		}
		int i = arr[arr.length-1];
		return i*2;
	}
}

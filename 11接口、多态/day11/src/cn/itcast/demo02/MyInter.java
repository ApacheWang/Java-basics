package cn.itcast.demo02;

import cn.itcast.demo01.MyInterface;

/*
 *  �ӿ��г�Ա���ص�
 *    1. ��Ա�������ص�, û�б���,���ǳ���
 *    �̶������ʽ: public static final �������� ������ = ֵ
 *    public  Ȩ��
 *    static  ���Ա�����ֱ��.����
 *    final   ����,�̶�ס������ֵ
 *    
// *    ע��: public static final ���η�,�ڽӿڵĶ�����,����ʡ�Բ�д
 *    ����,��д������û��
 *    �������η�,������ѡ������д
 *    
 *   2. �ӿ��еĳ�Ա�����ص�:
 *      public abstract ����ֵ���� ������(�����б�)
 *      ���η�  public abstract ���Բ�д,ѡ������д
 *      ����,д��д,����
 *      
 *   3. ʵ����,ʵ�ֽӿ�,��д�ӿ�ȫ�����󷽷�,����ʵ�������
 *      ʵ����,��д��һ���ֳ��󷽷�,ʵ����,����һ��������
 */
public interface MyInter {
	public static final  int x = 3;
	
	public abstract void show();
	
	public abstract int getSum(int a,int b);
}

package cn.itcast.demo02;
/*
 *  ���峤������
 *    �������,�ܳ�
 *  
 *  �߳�,��Ƶ�ʱ��,����Ϊ��Ա����,�������㷽���ľֲ�����
 *  ����˭��? ���ڳ���������, ÿ����������Ĺ���
 *  
 *  new CXF(10,8);
 */
public class CXF {
	 private int w;
	 private int h;
	 
	 public CXF(int w,int h){
		 this.w = w;
		 this.h = h;
	 }
	
	 public int getArea(){
		 return w*h;
	 }
	 
	 public int getLong(){
		 return (w+h)*2;
	 }
}

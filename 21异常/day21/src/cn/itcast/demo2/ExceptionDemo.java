package cn.itcast.demo2;
/*
 *  �̳к�,��������д���෽����ʱ��,�쳣����
 *  ����:
 *    ����ķ���,����׳��쳣,������д��
 *      ���Բ��׳��쳣
 *      Ҳ�����׳��쳣,����,�������Ҫ��,�׳����쳣���ܴ��ڸ�����쳣
 *        ����,��ָ���Ǽ̳й�ϵ
 *        
 *    ����ķ���,û���쳣�׳�,������д��
 *       Ҳ�����׳��쳣
 *       ��������е������׳��쳣�ķ���,����ѡ��,ֻ��try..catch����
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		Fu f = new Zi();
		f.function();
	}
}

class Fu{
	public void function(){
		
	}
}
class Zi extends Fu{
	public void function(){
		
			try {
				method();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	
	}
	public void method()throws Exception{
		
	}
}

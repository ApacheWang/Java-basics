package cn.itcast.demo1;

import java.lang.reflect.Method;

/*
 *  �����ȡ��Ա����������
 *  public void eat(){}
 */
public class ReflectDemo6 {
	public static void main(String[] args) throws Exception{
		Class c = Class.forName("cn.itcast.demo1.Person");
		Object obj = c.newInstance();
		//��ȡclass�����еĳ�Ա����
		// Method[] getMethods()��ȡ����class�ļ��е����й�����Ա����,�����̳е�
		// Method����������Ա�����Ķ���
		/*Method[] methods = c.getMethods();
		for(Method m : methods){
			System.out.println(m);
		}*/
		
		//��ȡָ���ķ���eat����
		// Method getMethod(String methodName,Class...c)
		// methodName��ȡ�ķ�����  c �����Ĳ����б�
		Method method = c.getMethod("eat");
		//ʹ��Method���еķ���,���л�ȡ���ķ���eat
		//Object invoke(Object obj, Object...o)
		method.invoke(obj);
	}
}

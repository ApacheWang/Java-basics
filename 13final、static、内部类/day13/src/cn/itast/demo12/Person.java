package cn.itast.demo12;
/*
 *  ��̬�����, ִֻ��һ��
 *  ��������,newһ��,��ִ��һ��,�����ڹ��췽��
 *  ���췽��, new һ��,��ִ��һ��
 */
public class Person {
  private String name;
  private int age;
  

  public Person(String name,int age){
	  this.age = age;
	  this.name = name;
	  System.out.println("���ǹ��췽��");
  }
  //��������
  {
	  System.out.println("���ǹ�������");
  }
  
  //��̬�����
  static{
	  System.out.println("���Ǿ�̬�����");
  }
}

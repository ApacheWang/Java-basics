/*
   ArrayList 集合中的方法
   
   add(参数) 向集合中添加元素,数据存储进去
   方法中的参数类型,定义集合对象时候的类型是一致
   
   ArrayList<Integer> array = new ArrayList<Integer>();
   array.add(3);
   
   get(int index) 取出集合中的元素,get方法的参数,写入索引
   
   size() 返回集合的长度, 集合存储元素的个数
*/
import java.util.ArrayList;
public class ArrayListDemo_1{
	public static void main(String[] args){
		//定义集合,存储字符串元素
		ArrayList<String> array = new ArrayList<String>();
		//调用集合方法add存储元素
		array.add("abc");
		array.add("itcast");
	    array.add("love");
		array.add("java");
		//输出集合的长度,调用集合方法size, size方法的返回值类型 int
		int size = array.size();
		System.out.println(size);
		
		//获取出集合中的一个元素,获取1索引的元素
		//集合的方法get, 获取元素后结果数据类型
		String s = array.get(1);
		System.out.println(s);
		
		
		System.out.println(array.get(0));
		System.out.println(array.get(1));
		System.out.println(array.get(2));
		System.out.println(array.get(3));
	}
}
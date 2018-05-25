/*
   for循环
     编写格式
	   for(初始化变量 ; 条件 ; 增量){
		   循环体
	   }
	   初始化变量: 定义变量,作用,控制循环的次数
	   条件: 当条件是true,执行循环体,条件是false,结束循环
	   增量: 变量自增情况
*/
public class ForDemo{
	public static void main(String[] args){
		//for循环,输出0-10
		for(int i = 0 ; i < 11 ; i++){
			System.out.println(i);
		}
	}
}
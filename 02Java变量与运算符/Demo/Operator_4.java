/*
    �߼������,������boolean��������֮����м���
	���Ҳ��boolean����
	
	& : һ����false,����������false, ����false,����false
	| : һ����true,����������true,����true,����true
	^ : ������ͬΪfalse,��ͬΪtrue
	! : ȡ�� !true = false  !false=true
	&& : ��·�� , һ����false,��һ�߲�����
	|| : ��·�� , һ����true,��һ�߲�����
*/
public class Operator_4{
	public static void main(String[] args){
		System.out.println( false & true );
		System.out.println( true | true );
		System.out.println( false ^ false );//F
		System.out.println( true ^ false );//T
		System.out.println( true ^ true );//F 
		
		
		System.out.println( !true );
		System.out.println( "--------------------------" );
		int i = 3;
		int j = 4;
		System.out.println(3>4 && ++j>2);
		System.out.println(i);
		System.out.println(j);
		
		System.out.println(3==3 || ++j>2);
		System.out.println(i);
		System.out.println(j);
	}
}
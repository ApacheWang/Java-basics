/*
    ASCII�������ʾ
	�ַ�Java ��������,char
	����Java ��������,int
	
	int ���ͺ� char ��������ת��
	char  �����ֽ�, int �ĸ��ֽ�
	
	charת��int���͵�ʱ��,�����Զ���ʾ,char��������,���ѯ�����,�õ�����
	intת��char���͵�ʱ��,ǿ��ת��,���ѯ�����
	
	char�洢����,��ѯUnicode�����
	
	char���Ժ�int����,��ʾΪint����, �ڴ��������ֽ�
	charȡֵ��Χ��0-65535, �޷��ŵ���������
*/
public class ASCIIDemo{
	public static void main(String[] args){
		char c = 'a';
		int i = c + 1;
		System.out.println(i);
		
		int j = 90;
		char h = (char)j;
		System.out.println(h);
		
		System.out.println( (char)6 );
		
		char k = '��';
		System.out.println(k);
		
		
		char m = -1;
	}
}
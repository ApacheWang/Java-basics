package cn.itcast.demo02;

public class StringTest {
	public static void main(String[] args) {
		getCount("A%A3eBr1FFy");
		System.out.println(toConvert("aBc5%4dEF"));
		System.out.println(getStringCount("hellojava,nijavahaojava,javazhenbang", "java"));
	}
	/*
	 *  ��ȡһ���ַ�����,��һ���ַ������ֵĴ���
	 *  ˼��:
	 *    1. indexOf���ַ����е���һ�γ��ֵ�����
	 *    2. �ҵ�������+�����ַ�������,��ȡ�ַ���
	 *    3. ������++
	 */
	public static int getStringCount(String str, String key){
		//���������
		int count = 0;
		//�������,����indexOf���Һ�������Ľ��
		int index = 0;
		//��ʼѭ����,����,indexOf==-1 �ַ���û����
		while(( index = str.indexOf(key) )!= -1){
			count++;
			//��ȡ��������,���ַ����������,��ȡ�ַ���
			str = str.substring(index+key.length());
		}
		return count;
	}
	
	/*
	 *  ���ַ���������ĸת�ɴ�д,��������ת��Сд
	 *  ˼��:
	 *    ��ȡ����ĸ, charAt(0)  substring(0,1)
	 *    ת�ɴ�д toUpperCase()
	 *    
	 *    ��ȡʣ���ַ���, substring(1)  toLowerCase()
	 */
	public static String toConvert(String str){
		//�������,��������ĸ,��ʣ���ַ�
		String first = str.substring(0,1);
		String after = str.substring(1);
		//����String�෽��,��д,Сдת��
		first = first.toUpperCase();
		after = after.toLowerCase();
		return first+after;
	}
	
	/*
	 * ��ȡָ���ַ����У���д��ĸ��Сд��ĸ�����ֵĸ�����
	 * ˼��:
	 *   1. ������,����int����,����һ������ ++
	 *   2. �����ַ���, ���ȷ���length() + charAt() ����
	 *   3. �ַ��ж��Ǵ�д,��Сд,��������
	 */
	public static void getCount(String str){
		//������������,����
		int upper = 0;
		int lower = 0;
		int digit = 0;
		//���ַ�������
		for(int i = 0 ; i < str.length() ; i++){
			//String����charAt,����,��ȡ�ַ�
			char c = str.charAt(i);
			//���ñ���� 65-90  97-122  48-57
			if(c >='A' && c <=90){
				upper++;
			}else if( c >= 97 && c <= 122){
				lower++;
			}else if( c >= 48 && c <='9'){
				digit++;
			}
		}
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(digit);
	}
}

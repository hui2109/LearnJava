public class Chartest
{
	public static void main(String[] args)
	{
		// ֱ��ָ�������ַ���Ϊ�ַ�ֵ
		char a = 'a';
		// ʹ��ת���ַ�����Ϊ�ַ�ֵ
		char b = '\r';
		// ʹ��Unicode����ֵ��ָ���ַ�ֵ
		char c = '\u9996';
		// ����һ�����á��ַ�ֵ
		char d ='��';
		// ֱ�ӽ�һ��char��������int���ͱ���ʹ��
		int e = d;
		// ֱ�Ӱ�һ��0~65535��Χ�ڵ�int��������һ��char����
		char f = 22909;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
}
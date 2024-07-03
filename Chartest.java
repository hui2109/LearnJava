public class Chartest
{
	public static void main(String[] args)
	{
		// 直接指定单个字符作为字符值
		char a = 'a';
		// 使用转义字符来作为字符值
		char b = '\r';
		// 使用Unicode编码值来指定字符值
		char c = '\u9996';
		// 定义一个“好”字符值
		char d ='好';
		// 直接将一个char变量当成int类型变量使用
		int e = d;
		// 直接把一个0~65535范围内的int整数赋给一个char变量
		char f = 22909;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
}
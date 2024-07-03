// 下面代码是正确的，系统会自动把56当成byte类型处理
public class IntegerValTest
{
	public static void main(String[] args)
	{
		byte a=56;
		long bigValue2=999999999999999999L;
		System.out.println(a);
		System.out.println(bigValue2);
	}
}

/*
 * 下面代码是错误的，系统不会把999999999999999999当成long类型处理
 * 所以超出int的表数范围，从而引起错误
 */
 // long bigValue=999999999999999999;
 // 下面代码是正确的，在巨大的整数值后使用L后缀，强制使用long类型
public class FloatTest
{
	public static void main(String[] args)
	{
		float a = 5.2345556f;
		//将看到a的值已经发生了改变
		double b = 0.0;
		double c = Double.NEGATIVE_INFINITY;
		float d = Float.NEGATIVE_INFINITY;
		// 看到float和double的负无穷大是相等的
		System.out.println(a);
		System.out.println(c == d);
		// 0.0除以0.0将出现非数
		System.out.println(b / b);
		// 两个非数之间是不相等的
		System.out.println(b / b == Float.NaN);
		// 所有正无穷大都是相等的
		System.out.println(6.0 / 0 == 555.0 / 0);
		// 负数除以0得到负无穷大
		System.out.println(-8.0 / 0);
		System.out.println(-8 / 0.0);
		// 下面的代码将抛出除以0的异常；
		System.out.println(0 / 0 );
		System.out.println(8 / 0 );
	}
}
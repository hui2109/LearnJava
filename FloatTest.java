public class FloatTest
{
	public static void main(String[] args)
	{
		float a = 5.2345556f;
		//������a��ֵ�Ѿ������˸ı�
		double b = 0.0;
		double c = Double.NEGATIVE_INFINITY;
		float d = Float.NEGATIVE_INFINITY;
		// ����float��double�ĸ����������ȵ�
		System.out.println(a);
		System.out.println(c == d);
		// 0.0����0.0�����ַ���
		System.out.println(b / b);
		// ��������֮���ǲ���ȵ�
		System.out.println(b / b == Float.NaN);
		// ���������������ȵ�
		System.out.println(6.0 / 0 == 555.0 / 0);
		// ��������0�õ��������
		System.out.println(-8.0 / 0);
		System.out.println(-8 / 0.0);
		// ����Ĵ��뽫�׳�����0���쳣��
		System.out.println(0 / 0 );
		System.out.println(8 / 0 );
	}
}
public class Operator1
{
	public static void main(String[] args)
	{
		int a = 275;
		int b = -126;

		System.out.println(a&b);
		System.out.println(a | b);
		System.out.println(a^b);
		String str = Integer.toBinaryString(b);
		System.out.println(str);
		int c = 4;
		System.out.print(Operator2.square(c));
	}
}
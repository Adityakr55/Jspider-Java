public class C
{
	public static void main(String[] args)
	{
		System.out.println("main stars");
		C.m1();
		System.out.println("main ends now");
	}

	public static void m1()
	{
		System.out.println("m1 stars");
		m2();
		System.out.println("m1 ends");
	}

	public static void m2()
	{
		System.out.println("m2 stars");
		System.out.println("m2 ends");
	}

}
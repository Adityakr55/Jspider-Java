class Static1
{
	static int a;
	public static void main(String[] args)
	{

		System.out.println(a);
		int a = 30;
		a = 40;
		Static1.a = 50;
		System.out.println(a);
		System.out.println(Static1.a);

	}
}
class Swap2
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;

		System.out.println("Number before swaping..");
		System.out.println(a);
		System.out.println(b);

		a = a+b;
		b = a - b;
		a = a - b;

		System.out.println("Number after swaping..");
		System.out.println(a);
		System.out.println(b);
	}
}
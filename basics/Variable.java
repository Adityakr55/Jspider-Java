class Variable
{
	static int i = 10;
	static int j = 20;
	int k = 30;
	int l = 40;
	public static void main(String[] args)
	{
		int a;

		// System.out.println(a); // CTE

		a = 10;

		int j = 5;

		System.out.println(a); // 10

		a = 20;

		System.out.println(a); // 20

		Variable v = new Variable();

		// System.out.println(Variable.k);// CTE
		System.out.println(v.k); // 30
		System.out.println(v.l); // 40
		System.out.println(i); // 10
		System.out.println(Variable.i); // 10
		System.out.println(v.i); // 10
		System.out.println(j); // 5
		System.out.println(Variable.j); // 20

	}
}
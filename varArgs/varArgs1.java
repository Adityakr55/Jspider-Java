class VarArgs1
{
	public static void m1(int ... a)
	{
		for(int n:a)
		{
			System.out.println("M1 is executed: "+n);
		}
	}

	public static void m1(String ... s)
	{
		for(String n:s)
		{
			System.out.println("M1 is executed: "+n);
		}
	}

	public static void main(String[] args) {
		m1(10,20);
		System.out.println("=============");
		m1(30,40,50);
		System.out.println("==============");
		m1("Aditya");
		System.out.println("==============");
		m1("sita","Rama","Laxman","Hanuman");
	}
}
class Operator5
{
	public static void main(String[] args)
	{
		System.out.println("1" + 2 + 3); // 123
		System.out.println("1" + (2+3)); // 15
		System.out.println(1 + "2" + 3); // 123
		System.out.println(1 + 2 + "3"); // 33
		System.out.println(1 + "");		 // 1
	}
}
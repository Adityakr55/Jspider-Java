import java.util.Scanner;

class OddEven
{

	
	static Scanner sc = new Scanner(System.in);
	public static boolean oddEven()
	{

		int j = sc.nextInt();
		return j%2 == 0;
	}
	public void print(int n)
	{
		System.out.println(n);
	}
	public static void main(String[] args)
	{
		
		System.out.print("Enter a number: ");
		OddEven obj = new OddEven();
		int n = sc.nextInt();
		obj.print(n);
		System.out.println(n);
		System.out.println(OddEven.oddEven());
		sc.close();
	}
}
import java.util.Scanner;

class RangeOfPrimeNo
{
	public static void printPrime(int a,int b)
	{
		for(int i = a;i<=b;i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+" ");
			}
			
		}
	}

	public static boolean isPrime(int i)
	{
		if(i<=1)return false;
		for(int j = 2;j<=i/2;j++)
		{
			if(i%j == 0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range of value: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		printPrime(a,b);
	}
}
import java.util.Scanner;

class SecondHighestPrimeNo
{
	public static void secondHighestPrimeNo(int a,int b)
	{
		int count = 0;
		for(int i =b;i>=a;i--)
		{
			if(isPrime(i))
			{
				count++;
				if(count == 2)
				{
					System.out.print("The second highest prime no between "+a+" and "+b+" is: "+i);
					break;
				}
			}
		}
	}

	public static boolean isPrime(int n)
	{
		if(n<=1) return false;
		for(int j = 2;j<=n/2;j++)
		{
			if(n%j == 0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range value: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		secondHighestPrimeNo(a,b);
	}
}
import java.util.Scanner;

class PrimeNo1
{
	public static boolean isPrime(int n)
	{
		if(n<=1)return false;
		for(int i = 2;i<=n/2;i++)
		{
			if(n%i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		if(isPrime(n))
		{
			System.out.print(n+" is a prime no.");
		}
		else 
		{
			System.out.print(n+" is not a prime no.");
		}
	}
}
import java.util.Scanner;

class AlternatePrimeNo
{
	public static  void printAlternatePrimeNo(int a,int b)
	{
		int count = 0;
		for(int i = a;i<=b;i++)
		{
			if(isPrime(i))
			{
				count++;
				if(count%2 != 0)
				{
					System.out.print(i+" ");
				}
			}
		}
	}

	public static boolean isPrime(int i)
	{
		if(i<=1) return false;
		for(int j = 2;j<=i/2;j++)
		{
			if(i%j == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range value: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		printAlternatePrimeNo(a,b);
	}
}
import java.util.Scanner;

class PrintPrimeNo
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range value: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		

		System.out.print("Prime no between "+a+" and "+b+" is: ");

		for(int i = a;i<=b;i++)
		{

			if(i == 1)
			{
				continue;
			}

			boolean flag = true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j == 0)
				{
					flag = false;
					break;
				}
			}

			if(flag)
				{
					System.out.print(i+" ");
				}
		}
	}
}
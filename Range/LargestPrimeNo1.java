import java.util.Scanner;

class LargestPrimeNo
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range value: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		for(int i = b;i>=a;i--)
		{
			boolean flag = true;
			if(i == 1)
			{
				continue;
			}
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
				System.out.print("Largest Prime no is: "+i);
				break;
			}
		}
	}
}
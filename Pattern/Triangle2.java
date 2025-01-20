import java.util.Scanner;

class Triangle2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int n = sc.nextInt();

		for(int i = 1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print("  "); // here two space character should be use.
			}
			for(int j = 1;j<=i;j++)
			{
				System.out.print("X ");
			}
			System.out.println();
		}

		// for(int i=1;i<=n;i++)
		// {
		// 	for(int j = 1;j<=n;j++)
		// 	{
		// 		if(i+j>n)
		// 		{
		// 			System.out.print("X ");
		// 		}
		// 		else
		// 		{
		// 			System.out.print("  "); // here two space character should be use.
		// 		}
		// 	}
		// 	System.out.println();
		// }
	}
}
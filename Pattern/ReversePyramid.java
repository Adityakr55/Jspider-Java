import java.util.Scanner;

class ReversePyramid
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n = sc.nextInt();
		if(n%2 != 0)
		{
			n++;
		}
		int k = 0;
		int l = n;

		for(int i = 1;i<=n;i++)
		{
			for(int j = 1;j<=k;j++)
			{
				System.out.print("   ");
			}
			for(int j = 0;j<=l;j++)
			{
				System.out.print(" * ");
			}
			k++;
			l-=2;
			System.out.println();
		}
	}
}
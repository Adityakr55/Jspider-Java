import java.util.Scanner;

class Pattern3
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int n = sc.nextInt();

		for(int i =1;i<=n;i++)
		{
			for(int j = 1;j<=n;j++)
			{
				if(i == 1 || i == n)
				{
					System.out.print("X ");
				}
				else 
				{
					if(j == 1 || j == n)
					{
						System.out.print("X ");
					}
					else 
					{
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
	}
}
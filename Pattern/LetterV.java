import java.util.Scanner;
class LetterV
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n = sc.nextInt();

		if(n%2 == 0)n++;
		for(int i = 1;i<=n/2+1;i++)
			{
				for(int j = 1;j<=n;j++)
				{
					if(i == j || i+j == n+1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
	}
}
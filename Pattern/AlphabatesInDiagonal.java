import java.util.Scanner;

class AlphabatesInDiagonal
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n = sc.nextInt();

		if(n%2 == 0)n++;
		char letter = 'A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i == j || i+j == n+1)
				{
					System.out.print(letter);
					letter++;
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
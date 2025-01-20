import java.util.Scanner;
class LetterJ
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n = sc.nextInt();
		if(n%2==0)n++;
		for(int i=1;i<=n;i++)
		{
			for(int j = 1;j<=n;j++)
			{
				if(i == 1||j == n/2+1||(i == n)&&(j<=n/2+1))
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
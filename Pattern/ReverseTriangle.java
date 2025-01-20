import java.util.Scanner;

class ReverseTriangle
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int n = sc.nextInt();

		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("X ");
			}
			System.out.println();
		}
	}
}

import java.util.Scanner;

class NumberTriangle
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int n = sc.nextInt();
		int k=0;

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				k++;
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
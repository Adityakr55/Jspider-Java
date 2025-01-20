import java.util.Scanner;

class HollowPyramid
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of rows: ");
		int n = sc.nextInt();

		int k = n;

		for(int i = 1;i<=n;i++)
		{
			for(int j =1;j<=k;j++)
			{
				if(i+j == n || j-i == n-1 || i== n)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			k++;
		}
	}
}
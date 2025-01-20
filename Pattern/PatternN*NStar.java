import java.util.Scanner;

class Pattern1
{
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the value of lines: ");
	int n = sc.nextInt();

	for(int i=1;i<=n;i++)
	{
		for(int j = 1;j<=n;j++)
		{
			System.out.print("X ");
		}
		System.out.println();
	}
	}
	
}

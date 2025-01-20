import java.util.Scanner;

class Pyramid
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n = sc.nextInt();
		int rowR = 1;
		int rowL = n;

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=rowL;j++)
			{
				System.out.print("   ");
			}

			for(int j=1;j<=rowR;j++)
			{
				System.out.print(" * ");
			}


			
			rowR+=2;
			rowL--;
			System.out.println();
		}	
	}
}
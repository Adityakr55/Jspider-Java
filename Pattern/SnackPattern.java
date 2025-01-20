import java.util.Scanner;
class SnackPattern
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n = sc.nextInt();

		for(int i =1;i<=n;i++)
		{
				if(i%2 != 0)
				{
					int k = n*i -(n-1);
					for(int j =1;j<=n;j++)
					{
						System.out.print(k+"\t" );
						k++;
					}
				}
				else
				{
					int k=n*i;
					for(int j=1;j<=n;j++)
					{
						System.out.print(k+"\t");
						k--;
					}
				}
				System.out.println();
		}

		int p = 0;
		int l = 1;
		for(int i = 0;i<n;i++)
		{
			if(i%2 == 0)
			{
				
				for(int j = 2*n*p + 1;j<= 2*n*p +n;j++)
				{
					System.out.print(j+"\t");
				}
				p++;
			}
			else
			{
				for(int j = 2*n*l;j>2*n*l-n;j--)
				{
					System.out.print(j+"\t");
				}
				l++;
			}
			System.out.println();
		}
	}
}
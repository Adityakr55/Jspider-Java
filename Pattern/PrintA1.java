import java.util.Scanner;

class PrintA
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of row: ");
		int n = sc.nextInt();

		for(int i = 1;i<=n;i++)
		{
			for(int j = 1;j<2*n;j++)
			{
				if(i+j == n+1 || j-i == n-1 )
				{
					System.out.print("*");
				}
				
				else if (i == n / 2 + 1 && j > n / 2 && j < 2 * n - n / 2) 
				{

					if(n%2 == 0)
					{
						if ((j - n / 2) % 2 == 1) 
	                    {
	                        System.out.print(" ");
	                    } 
	                    else 
	                    {
	                        System.out.print("*");
	                    }
	                }
                    else 
                    {
                    	if ((j - n / 2) % 2 == 1) 
	                    {
	                        System.out.print("*");
	                    } 
	                    else 
	                    {
	                        System.out.print(" ");
	                    }
                    }

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
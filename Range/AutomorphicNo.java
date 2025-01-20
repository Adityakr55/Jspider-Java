import java.util.Scanner;
class AutomorphicNo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of range: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		for(int i=a;i<=b;i++)
		{
			int sq = i*i;
			int n = i;
			boolean flag = true;
			while(n>0)
			{
				int k = n%10;
				int m = sq%10;
				if(k != m)
				{
					flag = false;
					break;
				}

				n/=10;
				sq/=10;
			}

			if(flag)
			{
				System.out.print(i+" ");
			}
		}
	}
}
import java.util.Scanner;

class ArmstrongNo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of range: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		for(int i = a;i<=b;i++)
		{
			int sum = 0;
			int n = i;
			int len = (n+"").length();


			while(n>0)
			{
				int r = n%10;
				sum +=(int)Math.pow(r,len);
				n /=10;
			}

			if(sum == i)
				{
					System.out.print(sum+" ");
				}
			
		}

		// for(int i = a;i<=b;i++)
		// {
		// 	int num = i;
		// 	int sum = 0;
		// 	int n = 0;

		// 	int temp = i;
		// 	while(temp != 0)
		// 	{
		// 		temp /= 10;
		// 		n++;
		// 	}

		// 	temp = i;
		// 	while(temp != 0)
		// 	{
		// 		int d = temp%10;
		// 		sum += (int)Math.pow(d,n);
		// 		temp /= 10;
		// 	}
		// 	if(sum == i)
		// 	{
		// 		System.out.print(sum+" ");
		// 	}
		// }
	}
}
import java.util.Scanner;

class AlternatePrimeNo
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of range: ");
		int a = sc.nextInt();
		int b = sc.nextInt();


		int count = 0;
		for(int i=a;i<=b;i++)
		{

			if(i==1)
			{
				continue;
			}

			boolean flag = true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j == 0)
				{
					flag = false;
					break;
				}
			}

			if(flag)
			{
				count++;
				if(count%2 != 0)
				{
					System.out.print(i+" ");
				}

			}
		}
	}
}
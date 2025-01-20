import java.util.Scanner;

class HighestPalindrome
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range values: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		for(int i = b;i>=a;i--)
		{
			int n = i;
			int m = n;

			int sum = 0;
			while(n>0)
			{
				int k = n%10;
				n/=10;
				sum = sum*10 + k;
			}

			if(sum == m)
			{
				System.out.println(m);
				break;
			}
		}

	}
}
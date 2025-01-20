import java.util.Scanner;

class StrongNo
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of range: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		for(int i = a;i<=b;i++)
		{
			int n = i;
			
			int sum = 0;
			while(n>0)
			{
				int fact = 1;
				int r = n%10;
				
				while(r>0)
					{
						fact *=r;
						r--;
					}
				sum +=fact;
				n /=10;
			}
			if(sum == i)
			{
				System.out.print(i+" ");
			}
		}
	}
}
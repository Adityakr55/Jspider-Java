import java.util.Scanner;

class StrongNo1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :- ");
		int n = sc.nextInt();
		int m =n;

		int a = 0,sum = 0;

		while(n>0)
		{
			int fact = 1;
			a = n%10;
			n /= 10;

			while(a>0)
			{
				fact *= a;
				a--;
			}
			sum += fact;
		}

		if(sum == m)
		{
			System.out.println(m+" is a strong number.");

		}
		else 
		{
			System.out.println(m+" is not a strong number.");
		}
	}
}
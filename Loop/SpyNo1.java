import java.util.Scanner;

class SpyNo1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a numbr:- ");
		int n = sc.nextInt();
		int m =n;

		int sum =0,pro = 1;

		while(n>0)
		{
			sum += n%10;
			pro *= n%10;

			n /= 10;
		}

		if(sum == pro)
		{
			System.out.println(m+" is a spy number");

		}
		else 
		{
			System.out.println(m+" is not a spy number");
		}
	}
}
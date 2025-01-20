import java.util.Scanner;

class Automorphic1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :- ");
		int n = sc.nextInt();
		boolean flag = false;
		int m = n;

		int sqr = n*n;

		while(n>0)
		{
			if(n%10 != sqr%10)
			{
				flag = true;
				break;
			}
			n /=10;
			sqr /=10;
		}

		if(flag)
		{
			System.out.println(m+" is not an automorphic number.");
		}
		else 
		{
			System.out.println(m+" is an automorphic number.");
		}
	}
}
import java.util.Scanner;

class CreateFiboSeries3
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a range :- ");
		int l = sc.nextInt();
		int u = sc.nextInt();

		int a = 0,b = 1,c = 0;

		System.out.print("Fibonacci series between "+l+" and "+u+" is :- ");
		while(a<=u)
		{
			if(a>=l)
			{
				System.out.print(a+" ");
			}
			c = a+b;
			a = b;
			b = c;
		}
	}
}
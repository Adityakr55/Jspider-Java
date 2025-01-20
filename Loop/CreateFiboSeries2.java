// Create a fibonacci series till or before the given number.

import java.util.Scanner;

class CreateFiboSeries2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print ("Enter a number :- ");
		int n = sc.nextInt();

		int a = 0,b = 1,c = 0;
		System.out.print("The fibonacci series till "+n+" is :- ");
		while(a<=n)
		{
			System.out.print(a+" ");
			c = a + b;
			a = b;
			b = c;
		}
	}
}
// Write a java program to check whether a given no is prime or not.

import java.util.Scanner;
class PrimeOrNot1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int n = sc.nextInt();
		boolean flag = true;
		if(n<=1)
		{
			flag =false;
		}
		else 
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					flag = false;
				}
			}
		}
		if(flag){
			System.out.println("prime no.");
		}
		else 
		{
			System.out.println("Not a prime no.");
		}
	}
}
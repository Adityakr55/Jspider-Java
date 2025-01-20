import java.util.Scanner;

class PalindromeNo1
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");

		int n = sc.nextInt();
		int m = n;

		int sum = 0;
		while(n>0)
		{
			sum = sum*10 + n%10;
			n/=10;
		}

		if(sum == m)
		{
			System.out.print(m+" is a palindrome number.");
		}
		else 
		{
			System.out.print(m+" is not a palindrome number.");
		}
	}
}
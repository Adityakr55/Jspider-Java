import java.util.Scanner;

class AlternatePalindromeNo
{
	public static void alternatePalindromeNo(int a,int b)
	{
		int count = 0;
		for(int i =a;i<=b;i++)
		{

			if(isPalindrome(i))
			{
				count++;
				if(count%2 != 0)
				{
					System.out.print(i+" ");
				}
			}
		}
	}

	public static boolean isPalindrome(int i)
	{
		int n = i;

		int rev = 0;
		while(i>0)
		{
			int k = i%10;
			rev = rev*10 + k;
			i /=10;
		}

		return n == rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range value: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		alternatePalindromeNo(a,b);
	}
}
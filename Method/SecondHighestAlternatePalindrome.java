import java.util.Scanner;

class SecondHighestAlternatePalindrome
{
	public static void secondHighestAlternatePalindrome(int a,int b)
	{
		int count = 0;
		int alternat = 0;
		for(int i =b;i>=a;i--)
		{

			if(isPalindrome(i))
			{
				count++;
				if(count%2 != 0)
				{
					alternat++;
					if(alternat == 2)
					{
						System.out.print(i);
					}
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

		secondHighestAlternatePalindrome(a,b);
	}
}
import java.util.Scanner;

class IfElse
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		System.out.println("enter your number:-");
		int b = sc.nextInt();

		if(a>0 && a<10)
		{
			System.out.println(a +"is between 1 and 10 number");
		}
		else if(b>10 && b<20)
		{
			System.out.println(b + "is between 10 and 20 number");
		}
		else
		{
			System.out.println("Enter a valid integer number");
		}

		
	}
}
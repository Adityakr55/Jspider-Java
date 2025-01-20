import java.util.Scanner;

class DecimalToBinary
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int m = n;

		String bin = "";

		while(n>0)
		{
			int bit = n%2;
			bin = bit+bin;
			n /=2;

		}

		System.out.println("Binary of "+n+" = "+s);
		System.out.println("Type of 's' is: " + ((Object)s).getClass().getSimpleName());   // here the output will be string.
	}
}
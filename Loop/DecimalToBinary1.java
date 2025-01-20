import java.util.Scanner;

class DecimalToBinary1
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int m = n;

		int bin = 0,i = 1;
		while(n>0)
		{
			int bit = n%10;
			bin = bit*i + bin;
			i *=10;
			n /=2;
		}

		System.out.println("Binary of "+m+" = "+bin);   // here the output will be integer.
	}
}
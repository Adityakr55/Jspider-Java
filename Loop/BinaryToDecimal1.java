import java.util.Scanner;

class BinaryToDecimal1
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a binary number: ");
		int n = sc.nextInt();
		int m = n;

		int sum = 0;
		int i = 1;
		while(n>0)
		{
			int bit = n%10;
			sum += bit*i;
			i *=2;
			n /=10;
		}

		System.out.println("Decimal of "+m+" = "+sum);
	}
}
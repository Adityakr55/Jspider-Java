import java.util.Scanner;

class DecimaltoDecimal{

	public static int fun(int n)
	{
		int oct = 0;
		int place = 1;
		while(n > 0)
		{
			int r = n%8;
			n /= 8;
			oct = oct + place*r;
			place *=10;
		}

		return oct;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fun(n));
	}
}
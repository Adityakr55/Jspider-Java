import java.util.Scanner;

class PowerMethod
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numbers: ");
		int n = sc.nextInt();
		int p = sc.nextInt();

		double d = Math.pow(n,p);
		System.out.println(d);

		int m = (int)d;
		System.out.println(m);

		int k = (int)Math.pow(n,p);
		System.out.println(k);
	}
}
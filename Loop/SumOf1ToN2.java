import java.util.Scanner;
class SumOf1ToN2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int n = sc.nextInt();

		String s = " ";
		int sum = 0;
		for(int i=1;i<=n;i++)
		{
			sum +=i;
			s +=i;
			if(i<n)
				s +="+";
		}
		System.out.println(s +"=" +sum);
	}
}
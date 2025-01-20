import java.util.Scanner;

class ArmstrongNo1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :- ");
		int n = sc.nextInt();
		int m = n;
		int sum = 0;
		
		int r = 0;

		while(n>0)
		{
			n /=10;
			r++;
		}
		n = m;

		while(m>0)
		{
			int k = m%10;
			int prod = 1;
			for(int j=1;j<=r;j++)
			{
				prod *=k;
			}
			sum +=prod;
			m /=10;
		}

		if(n == sum)
		{
			System.out.println(n+" is an armstrong number.");
		}
		else 
		{
			System.out.println(n+" is not an armstrong number.");
		}
		
	}
}
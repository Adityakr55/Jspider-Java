import java.util.Scanner;

class PerfectNo1
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1,sum = 0;
		if(n<2)
		{
			System.out.println(n+" is not a perfect number.");
		}
		else 
		{
			do
		{
			if(n%i == 0)
			{
				sum +=i;
			}
			
			i++;
		}
		while(i<=n/2);

			if(sum == n)
			{
				System.out.println(n+" is a perfect number ");
			}
			else 
			{
				System.out.println(n+" is not a perfect number ");
			}
		}
		
	}
}
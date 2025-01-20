import java.util.Scanner;

class LCMofTwoNo
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		boolean flag = true;

		int n = a>b?a:b;
		int m = n;
		int i = 1;
		while(true)
		{

			if(n%a == 0 && n%b == 0)
			{
				flag = false;
				
				break;
			}
			
			n=m*i;
			i++;
		}
		
		System.out.println(n);

	}
}
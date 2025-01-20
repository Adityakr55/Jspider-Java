import java.util.Scanner;

class CreateFiboSeries1
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of terms:-");
		int n = sc.nextInt();

		int a = 0,b=1,c = 0,i =1;

		while(i<=n)
		{
			System.out.print(a+" ");
			c = a+b;
			a = b;
			b = c;
			i++;
		}
	}
}
import java.util.Scanner;

class ReverseNo1
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");

	int n = sc.nextInt();
	int m = 0;
	int k = n;

	while(n>0)
	{
		m = m*10 + n%10;
		n /=10;
	}

	System.out.println("Reverse of "+k+" is: "+m);
	}
	
}
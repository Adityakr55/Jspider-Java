 import java.util.Scanner;

 class PerfectNo1
 {
 	public static boolean isPerfect(int i)
 	{	int sum = 0;
 		for(int j = 1;j<=i/2;j++)
 		{
 			if(i%j == 0)
 				sum+=j;
 		}

 		return sum == i;
 	}

 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter a number: ");
 		int n = sc.nextInt();
 		if(isPerfect(n))
 		{
 			System.out.print(n+" is a perfect number.");
 		}
 		else 
 		{
 			System.out.print(n+" is not a perfect number.");
 		}
 	}
 }
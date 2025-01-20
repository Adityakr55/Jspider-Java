import java.util.Scanner;
class Switch2
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a weekday number");
		int d = sc.nextInt();

		switch(d)
		{
			
			case 1 -> System.out.println("Monday");
					
			case 2 -> System.out.println("Tuesday");
					
			case 3 -> System.out.println("Wednesday");
					
			case 4 -> System.out.println("Thursday");
				
			default -> System.out.println("invalid input");
					
			case 5 -> System.out.println("Friday");
					
			case 6 -> System.out.println("Saturday");
					
			case 7 -> System.out.println("Sunday");
				
		}
		
	}
}
import java.util.Scanner;
class Switch3
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of month and year respectively:-");
		int m = sc.nextInt();
		int y = sc.nextInt();

		/* -----------------------method 1st---------------------------- */

		switch(m)
		{
			case 2->
				{
					if((y%4 == 0 && y%100 != 0) || (y%400 == 0))
					{
						System.out.println("29 days");
						break;
					}
					else 
					{
						System.out.println("28 days");
						break;
					}
				}
			case 1,3,5,7,8,10,12 -> System.out.println("31 days");
			case 4,6,9,11 -> System.out.println("30 days");
			default -> System.out.println("invalid input");

		

		/* --------------------method 2nd---------------------- 
			
			switch(m)
		{
			case 2:
				{
					if((y%4 == 0 && y%100 != 0) || (y%400 == 0))
					{
						System.out.println("29 days");
						break;
					}
					else 
					{
						System.out.println("28 days");
						break;
					}
				}
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
					
					System.out.println("31 days");
					break;
			case 4 :
			case 6 :
			case 9 :
			case 11:
				
					System.out.println("30 days");
					break;
			default :
			 System.out.println("invalid input");
			 break;

			/* case 1 ->;   this will not work as this is syntactically wrong.
			case 3 ->;
			case 5 ->;
			case 7 ->;
			case 8 ->;
			case 10 ->;
			case 12 ->
					
					System.out.println("31 days");
			case 4 ->;
			case 6 ->;
			case 9 ->;
			case 11 ->
				
					System.out.println("30 days");
			default -> System.out.println("invalid input");

			*/
		
			 
			
				
		}
		
	}
}
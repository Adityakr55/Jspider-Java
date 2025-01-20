import java.util.Scanner;
class LengthOfString
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string:-");
		String s = sc.next();
		int l=s.length();
		System.out.println("length of "+s+" ="+l);

		System.out.print("Enter a number:- ");
		int n = sc.nextInt();
		int len = (n+"").length();  // here we are converting integer into string and then applying string method 
		System.out.print("lenght of integer "+n+" ="+len);

		System.o
	}
}



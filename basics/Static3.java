public class Static3
{
	static int age ;
	static double height;
	static char gender;
	static boolean status ;
	static long mobile;

	public static void main(String[] args)
	{
		System.out.println("My age is:- "+Static2.age);
		System.out.println("My height is:- "+Static2.height);
		System.out.println("My gender is:- "+Static2.gender);
		System.out.println("Is i am married:- "+Static2.status);
		System.out.println("My contact no is:- "+Static2.mobile);

		System.out.println("My age is:- "+Static3.age);
		System.out.println("My height is:- "+Static3.height);
		System.out.println("My gender is:- "+Static3.gender); // char data of static type ha no default value.
		System.out.println("Is i am married:- "+Static3.status);
		System.out.println("My contact no is:- "+Static3.mobile);
	}
}
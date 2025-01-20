import java.util.Scanner;

class ClassProblem1
{
	public static boolean checkRecur(int n, int sum, int idx){
		if(idx > n / 2){
			return sum == n;
		}else{
			if(n % idx == 0){
				sum += idx;
				return  checkRecur(n, sum, idx + 1);
			}
			return checkRecur(n, sum, idx + 1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// by single while loop.

		// int sum = 0;
		// while(n>0)
		// {
		// 	sum += n%10;
		// 	n /= 10;

		// 	if(n == 0 && sum>9)
		// 	{
		// 		System.out.println(sum);
		// 		n = sum;
		// 		sum = 0;
		// 	}
		// }

		// System.out.println(sum);



		// by nested while loop.

		// int sum = 0;
		// while(n>9)
		// {
		// 	while(n>0)
		// 	{
		// 		sum +=n%10;
		// 		n /=10;
		// 	}
		// 	System.out.println(sum);
		// 	n = sum;
		// 	sum =0;
		// }

		// System.out.println(sum);


		// by do while loop.

		// int sum =0;
		// do
		// {
		// 	sum +=n%10;
		// 	n /= 10;
		// 	if(n ==0 && sum>9)
		// 	{
		// 		System.out.println(sum);
		// 		n = sum;
		// 		sum = 0;
		// 	}
		// }
		// while(n>0);

		// 	System.out.println(sum);
 

	    boolean ans = checkRecur(n, 0, 1);
	    System.out.println(ans);


			
	}
	// recursion


}
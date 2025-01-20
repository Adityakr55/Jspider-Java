import java.util.Scanner;
class Alternative{
	public static int fibo(int idx){
		if(idx == 0) return 0;
		if(idx == 1) return 1;
		return fibo(idx - 1) + fibo(idx - 2);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your lower bound");
		int l = sc.nextInt();
		System.out.println("Enter your upper bound");
		int u = sc.nextInt();
		for(int i = l - 1; i <= u - 1; i++){
			System.out.println(fibo(i));
		}
	}
}
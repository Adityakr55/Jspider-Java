import java.util.Scanner;
class PrimeOrNot2{
	  public static boolean check(int n, int i){
	  	if(n <= 1){
	  		return false;
	  	}else{
           if(i == n / 2){
           	return true;
           }else{
           	if(n % i == 0){
           		return false;
           	}else{
           		return check(n, i++);
           	}
           }
	  	}
	  }
      public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
      	System.out.println("Enter the number");
      	int n = sc.nextInt();
      	boolean ans = check(n, 2);
      	if(ans){
      		System.out.println("Prime");
      	}else{
      		System.out.println("Not a prime");
      	}
      }
}
import java.util.Scanner;
class HCFofTwoNo1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number:- ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int m = a<b?a:b;

        while(m>0)
        {
            if(a%m == 0 && b%m == 0)
            {
                break;
            }
            m--;
        }
        System.out.print("HCF of "+a+" and "+b+" is :- "+m);
    }
}
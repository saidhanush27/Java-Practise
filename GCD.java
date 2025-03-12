
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Enter the first number:");
        Scanner sc = new Scanner(System.in);
        num1 =sc.nextInt();
        System.out.println("Enter the Second Number:");
        num2 =sc.nextInt();
        int gcd =1;

        for (int i = 1; i <= Math.min(num1, num2); i++){
            if (num1 % i == 0 && num2 % i == 0){
            gcd = i;  
            }
        }
       System.err.println("The GCD is :" + gcd);\
       sc.close();
    }}
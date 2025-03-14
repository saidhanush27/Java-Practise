
import java.util.Scanner;

public class Primenumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int number = sc.nextInt();



  //if a number is divisible by a value greater than its square root, then it must also be divisible by a smaller value that has already been checked.
        if ( number < 2 ){
            System.out.println( number + " is not a prime number ");
            return;
        }
         for (int i = 2; i< Math.sqrt(number);i ++ ){
            System.out.println(number + " is not a prime number");
            return;
         }
         System.out.println(number + "  is a prime number ");
    }
}  

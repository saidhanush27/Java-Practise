
import java.util.Scanner;

public class Factorial {
    static int factorial(int n){
     return(n == 0 || n== 1) ? 1 : n * factorial(n - 1) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        System.out.println("Factorial: " + factorial(sc.nextInt()));
        sc.close();
    }
}

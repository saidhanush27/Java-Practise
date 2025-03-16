
import java.util.Scanner;

public class swapping2numbers{
    public static void main(String[] args) {
        int a,b, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        a = sc.nextInt();
        System.out.println("\nEnter second number :");
        b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("first number :"+ a);
        System.out.println("\nsecond number :"+ b);
    }
}
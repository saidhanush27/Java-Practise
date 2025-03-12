import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isAutomorphic(n)) {
            System.out.println(n + " is an Automorphic number.");
        } else {
            System.out.println(n + " is NOT an Automorphic number.");
        }

        sc.close(); 
    }

    static boolean isAutomorphic(int n) {
        int sq = n * n;

        while (n > 0) {
            if (n % 10 != sq % 10) { // Compare last digits
                return false;
            }
            n /= 10; 
            sq /= 10; 
        }
        return true; // If all digits match
    }
}

import java.util.Scanner;

public class Strong {
    // 145= 1!*4!*5!
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    
    public static boolean isStrongNumber(int number) {
        int sum = 0, temp = number;

        while (temp > 0) {
            int digit = temp % 10; // Extract the last digit
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
       
        if (isStrongNumber(num)) {
            System.out.println(num + " is a Strong Number.");
        } else {
            System.out.println(num + " is NOT a Strong Number.");
        }
        
        scanner.close();
    }
}

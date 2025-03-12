import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num, sum = 0, digits = 0, temp = num;
        //153= 1*3 +5*3 +3*3 = 153 
        while (temp > 0) {
            temp /= 10;  //temp = 153, digits = 1  ; temp = 15, digits = 2  ;temp = 1, digits = 3 ;  temp = 0 (Loop stops)
            digits++;    
        }
         temp = num;
        while (temp > 0) {
            int digit = temp % 10; // pick the last number
            sum += Math.pow(digit, digits); // store in sum to add 
            temp /= 10; // remove the last , proceed to next number  
        }

        return sum == originalNum;
    }
}


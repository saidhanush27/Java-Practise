
import java.util.Scanner;

public class Str{
    public static int factorial(int num){
        int fact =1;
        for (int i = 1; i <= num ;i ++){
        fact *=i;
        }        
        return fact;
}

public static boolean isStrongNumber(int number){
    int sum = 0, temp = number;

    while (temp>0){
        int digit = temp % 10;
        sum +=factorial(digit);
        temp /= 10;
    }
    return sum == number;
}
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int num = sc.nextInt();

           if (isStrongNumber(num)){
            System.out.println(num +" is a strong number ");
             }
             else{
        System.out.println(num +" is not  strong number ");
        sc.close();
      }
      
  }
  
}
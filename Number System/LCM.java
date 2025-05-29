
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
       int n1, n2, n3;
       System.err.println("Enter First number:");
       Scanner sc = new Scanner(System.in);
       n1 = sc.nextInt();
       System.err.println("Enter second number:");
       n2 = sc.nextInt();
      
  /// int lcm = Math.max(n1, Math.max(n2, n3));
       int lcm =(n1 > n2 ) ? n1 :n2 ;
       while (true) { 
           if (lcm % n1 ==0 && lcm % n2 == 0)
        


           System.out.println(" LCM IS :" + lcm);
           break;
           
       }
         ++lcm;
    
    
    }
    }
    


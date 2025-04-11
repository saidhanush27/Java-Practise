
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
    int operator, n1,n2;
    System.out.println("1 - add \n 2- subtract \n 3- multiply \n 4- divide");
    System.out.println("Choose the Operator: ");
    Scanner sc = new Scanner(System.in);
    operator = sc.nextInt();
    System.out.println("Choose the First number: ");
    n1 = sc.nextInt();
    System.out.println("Choose the Second number: ");
    n2 = sc.nextInt();
     
    int result = 0;
    switch(operator){
    case 1:
         result = n1+ n2;
        break; 
        
    case 2:
        result = n1 - n2;
       break; 
       
       case 3:
       result = n1 * n2;
      break;
      
    case 4:
      result = n1 / n2;
     break;    
     

    default: 
    System.out.println("Entered Operator is not valid!"); 

    }
   
    System.out.println("Result : "  + result); 

}

}
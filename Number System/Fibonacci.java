public class Fibonacci {
    public static void main(String[] args) {
        //The Fibonacci series is a series of elements where, the previous two elements are added to get the next element, starting with 0 and 1
     int n = 15, firstNum= 0, secondNum = 1;
     int nextNum;

     for (int i= 1; i <=n; i ++){
        System.out.println(firstNum + ", " );
        nextNum = firstNum + secondNum;
        firstNum = secondNum;
        secondNum = nextNum;
     }
    }}
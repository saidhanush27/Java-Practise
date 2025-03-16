import java.util.Arrays;
import java.util.Scanner;
public class Ascending{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n = sc.nextInt();
         int arr []=  new int[n];
         
        System.out.println(" enter the array:");
      for (int i =0;i<n;i++)
      arr[i] = sc.nextInt();
      Arrays.sort(arr);
      System.out.println("sorted array is :"+ Arrays.toString(arr));
      

    }}
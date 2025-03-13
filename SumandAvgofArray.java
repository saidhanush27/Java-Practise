

public class SumandAvgofArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        int length = array.length;
        int sum = 0;
        for (int i =0; i<length; i++) {
          sum = sum + array [i];  
        }
        System.out.println("sum of array is :" + sum );
        float average = sum/ length;
        System.out.println(" average of array is :" + average );
    }
}

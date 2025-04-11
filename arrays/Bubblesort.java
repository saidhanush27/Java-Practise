public class Bubblesort {
    public static void main(String[] args) {
        int arr[] ={5,3,2,1,4};
        int length = arr.length;
         for(int i =0; i <length ; i ++){
           for (int j = 1; j<length; j++){
            if(arr[j-1]> arr[j]){
                int temp =arr[j];
                arr [j]= arr[j-1];
                arr[j-1] =temp;
            }

           }

         }
        
         System.out.println("sorted array:");
         for (int i = 0 ; i<length ; i++) {
            System.out.println(arr[i] + " ");
         }
    }
}

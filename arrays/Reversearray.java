public class Reversearray {
    public static void main(String[] args) {
        int arr[]= new int[]{4,5,6,7,8};
        
        
        System.out.println("the array in original order is :");
        for(int i =0 ;i<arr.length; i ++){
        System.out.println( arr[i]+ " ");
        }
        
        
        System.out.println("the array in reverse order is :");
        for (int i = arr.length - 1;i >=0 ;i --) {
            System.out.print(arr[i] +"  ");

        }
     
    }
}

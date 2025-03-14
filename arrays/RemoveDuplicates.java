import java.util.Arrays;
public class RemoveDuplicates {
   public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr); // Sort the array first
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1]; // Add the last unique element

        // Copy unique elements into a new array of the correct size
        return Arrays.copyOf(temp, j);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};
        int[] uniqueNumbers = removeDuplicates(numbers);
        System.out.println(Arrays.toString(uniqueNumbers)); // Output: [1, 2, 3, 4, 5]
    }
}


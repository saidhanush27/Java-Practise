public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        int length = arr.length;
         
        // Selection Sort
        for (int i = 0; i < length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }

            // Swap the found minimum with the first element
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }

        // Print sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


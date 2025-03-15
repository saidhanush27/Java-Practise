import java.util.Scanner;

public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (result.indexOf(String.valueOf(c)) == -1) { // Check if character is already in result
                result.append(c);
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); // Read user input
        scanner.close(); // Close the scanner

        String output = removeDuplicates(input);
        System.out.println("Without Duplicates: " + output);
    }
}

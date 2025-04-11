

 public class Triangle {
    public static void main(String[] args) {
        int row = 6;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= (row - i); j++) {
                System.out.print("  "); // print spaces
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // print stars
            }
            System.out.println(); // move to the next line
        }
    }
}
import java.util.Scanner;

public class project1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("*************");
            System.out.println("BANKING PROGRAM");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*************");

            System.out.print("Enter Your Choice (1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> {
                    isRunning = false;
                    System.out.println("Thank you for using our banking program!");
                }
                default -> System.out.println("INVALID CHOICE!");
            }
        }

        sc.close();
    }

    static void showBalance(double balance) {
        System.out.println("*************");
        System.out.printf("Current Balance: $%.2f\n", balance);
    }

    static double deposit() {
        System.out.print("Enter amount to be deposited: ");
        double amount = sc.nextDouble();

        if (amount < 0) {
            System.err.println("The amount can't be negative!");
            return 0;
        } else {
            return amount;
        }
    }

    static double withdraw(double balance) {
        System.out.print("Enter the amount to be withdrawn: ");
        double amount = sc.nextDouble();

        if (amount < 0) {
            System.out.println("AMOUNT CAN'T BE NEGATIVE!");
            return 0;
        } else if (amount > balance) {
            System.out.println("INSUFFICIENT BALANCE!");
            return 0;
        } else {
            return amount;
        }
    }
}


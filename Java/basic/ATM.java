import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int amount = 10000;

        while (true) {

            System.out.println("\n===== MENU OF ATM =====");
            System.out.println("Deposit");
            System.out.println("Credit");
            System.out.println("Exit");

            System.out.println("Available balance is = " + amount);

            System.out.print("Enter your choice: ");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("deposit")) {

                System.out.print("Enter the amount: ");
                int amt = sc.nextInt();
                sc.nextLine();

                if (amt > 0) {
                    amount = amount + amt;

                    System.out.println(
                        "Deposit successful. Available balance is = " + amount
                    );
                } else {
                    System.out.println("Invalid amount.");
                }

            } else if (choice.equalsIgnoreCase("credit")) {

                System.out.print("Enter the amount: ");
                int amt = sc.nextInt();
                sc.nextLine();

                if (amt > 0 && amount >= amt) {
                    amount = amount - amt;

                    System.out.println(
                        "Credit successful. Available balance is = " + amount
                    );
                } else {
                    System.out.println("Insufficient balance or invalid amount.");
                }

            } else if (choice.equalsIgnoreCase("exit")) {

                System.out.println("Thank you for using ATM.");
                break;

            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
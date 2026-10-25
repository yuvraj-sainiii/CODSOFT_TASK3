import java.util.Scanner;

public class ATMInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 5000.00;
        int choice;

        System.out.println("Welcome to ATM Interface");

        while (true) {

            System.out.println("\n----- ATM MENU -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.printf(
                        "Current Balance: Rs. %.2f%n", balance
                    );
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: Rs. ");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful.");
                        System.out.printf(
                            "Updated Balance: Rs. %.2f%n", balance
                        );
                    } else {
                        System.out.println(
                            "Please enter a valid deposit amount."
                        );
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: Rs. ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println(
                            "Please enter a valid withdrawal amount."
                        );
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance -= withdraw;
                        System.out.println("Please collect your cash.");
                        System.out.printf(
                            "Remaining Balance: Rs. %.2f%n", balance
                        );
                    }
                    break;

                case 4:
                    System.out.println(
                        "Thank you for using the ATM."
                    );
                    sc.close();
                    return;

                default:
                    System.out.println(
                        "Invalid choice. Please select 1 to 4."
                    );
            }
        }
    }
}


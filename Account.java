import java.util.Scanner;

public class Account {
    String accountNumber;
    int balance;

    Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the account number");
        String accountNumber = sc.nextLine();

        if (accountNumber.length() == 0) {
            System.out.println("Invalid account number");
            System.exit(0);
        }

        System.out.println("Enter the balance");
        int balance = sc.nextInt();

        if (balance < 0) {
            System.out.println("Invalid balance");
            System.exit(0);
        }

        Account myAccount = new Account(accountNumber, balance);

        System.out.println("My account number is " + myAccount.accountNumber);
        System.out.println("My account balance is " + myAccount.balance);
    }
}

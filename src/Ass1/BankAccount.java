package Ass1;

public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal successful. New balance: $" + balance);
            } else {
                System.out.println("Insufficient funds. Withdrawal failed.");
            }
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        }
    }

  
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
       
        BankAccount account1 = new BankAccount(1001, "John Doe", 1000.0);
        BankAccount account2 = new BankAccount(1002, "Jane Smith", 1500.0);

        account1.displayAccountInfo();
        account1.deposit(500.0);
        account1.withdraw(200.0);

        System.out.println("\n");

        account2.displayAccountInfo();
        account2.withdraw(2000.0);
        account2.withdraw(500.0);
    }
}

package OOPS;
import java.util.*;
class Banks{
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public Banks(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNo(){
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
class BankAccount {
    ArrayList<Banks> list = new ArrayList<>();

    public void addAccount(Banks bank) {
        list.add(bank);
    }

    public void displayAllAccounts() {
        for (Banks bank : list) {
            bank.display();
            System.out.println("-------------------");
        }
    }

    public void withdraw(int accountNumber, double amount) {
        for (Banks bank : list) {
            if (bank.getAccountNo() == accountNumber) {
                if (bank.getBalance() >= amount) {
                    bank.setBalance(bank.getBalance() - amount);
                    System.out.println("Withdrawal successful. New balance: " + bank.getBalance());
                } else {
                    System.out.println("Insufficient balance.");
                }
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void deposit(int accountNumber, double amount) {
        for (Banks bank : list) {
            if (bank.getAccountNo() == accountNumber) {
                bank.setBalance(bank.getBalance() + amount);
                System.out.println("Deposit successful. New balance: " + bank.getBalance());
                return;
            }
        }
        System.out.println("Account not found.");
    }
}

public class BankAccountMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        BankAccount bankAccount = new BankAccount();

        do { 
            System.err.println("Bank Account Management System");
            System.err.println("1. Add Account\n2. Display All Accounts\n3. Withdraw\n4. Deposit\n5. Exit");
            System.err.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.err.println("Enter account number: ");
                    int accountNumber = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.err.println("Enter account holder name: ");
                    String accountHolderName = sc.nextLine();
                    System.err.println("Enter initial balance: ");
                    double balance = sc.nextDouble();
                    Banks bank = new Banks(accountNumber, accountHolderName, balance);
                    bankAccount.addAccount(bank);
                    break;
                case 2:
                    bankAccount.displayAllAccounts();
                    break;
                case 3:
                    System.err.println("Enter account number: ");
                    int accNumWithdraw = sc.nextInt();
                    System.err.println("Enter amount to withdraw: ");
                    double amountWithdraw = sc.nextDouble();
                    bankAccount.withdraw(accNumWithdraw, amountWithdraw);
                    break;
                case 4:
                    System.err.println("Enter account number: ");
                    int accNumDeposit = sc.nextInt();
                    System.err.println("Enter amount to deposit: ");
                    double amountDeposit = sc.nextDouble();
                    bankAccount.deposit(accNumDeposit, amountDeposit);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (true);

    }
}
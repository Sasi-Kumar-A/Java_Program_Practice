package OOPS;

import java.util.*;

class Banks {

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public Banks(int accountNumber, String accountHolderName, double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getters
    public int getAccountNo() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Display Method
    public void display() {

        System.out.println("Account Number      : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Balance             : " + balance);
    }
}

class BankAccount {

    ArrayList<Banks> list = new ArrayList<>();

    // Add Account
    public void addAccount(Banks bank) {

        list.add(bank);

        System.out.println("Account Added Successfully.");
    }

    // Display All Accounts
    public void displayAllAccounts() {

        if(list.isEmpty()) {

            System.out.println("No Accounts Available.");
            return;
        }

        for(Banks bank : list) {

            bank.display();

            System.out.println("--------------------------");
        }
    }

    // Withdraw
    public void withdraw(int accountNumber, double amount) {

        for(Banks bank : list) {

            if(bank.getAccountNo() == accountNumber) {

                if(bank.getBalance() >= amount) {

                    bank.setBalance(bank.getBalance() - amount);

                    System.out.println("Withdrawal Successful.");
                    System.out.println("Current Balance : " + bank.getBalance());
                }
                else {

                    System.out.println("Insufficient Balance.");
                }

                return;
            }
        }

        System.out.println("Account Not Found.");
    }

    // Deposit
    public void deposit(int accountNumber, double amount) {

        for(Banks bank : list) {

            if(bank.getAccountNo() == accountNumber) {

                bank.setBalance(bank.getBalance() + amount);

                System.out.println("Deposit Successful.");
                System.out.println("Current Balance : " + bank.getBalance());

                return;
            }
        }

        System.out.println("Account Not Found.");
    }
}

public class BankAccountMain {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        while(true) {

            System.out.println("\n===== BANK ACCOUNT MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Account");
            System.out.println("2. Display All Accounts");
            System.out.println("3. Withdraw");
            System.out.println("4. Deposit");
            System.out.println("5. Exit");

            System.out.print("Enter Your Choice : ");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.print("Enter Account Number : ");
                    int accountNumber = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Account Holder Name : ");
                    String accountHolderName = sc.nextLine();

                    System.out.print("Enter Initial Balance : ");
                    double balance = sc.nextDouble();

                    Banks bank = new Banks(accountNumber, accountHolderName, balance);

                    bankAccount.addAccount(bank);

                    break;

                case 2:

                    bankAccount.displayAllAccounts();

                    break;

                case 3:

                    System.out.print("Enter Account Number : ");
                    int withdrawAccNo = sc.nextInt();

                    System.out.print("Enter Amount To Withdraw : ");
                    double withdrawAmount = sc.nextDouble();

                    bankAccount.withdraw(withdrawAccNo, withdrawAmount);

                    break;

                case 4:

                    System.out.print("Enter Account Number : ");
                    int depositAccNo = sc.nextInt();

                    System.out.print("Enter Amount To Deposit : ");
                    double depositAmount = sc.nextDouble();

                    bankAccount.deposit(depositAccNo, depositAmount);

                    break;

                case 5:

                    System.out.println("Thank You...");

                    System.exit(0);

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}

//package OOPS;
//import java.util.*;
//<<<<<<< HEAD
//class Banks{
//=======
//class Bank{
//>>>>>>> b32fe2fb88d3f43a59f3bcb29af7453a8ca8a580
//    private int accountNumber;
//    private String accountHolderName;
//    private double balance;
//
//<<<<<<< HEAD
//    public Banks(int accountNumber, String accountHolderName, double balance) {
//=======
//    public Bank(int accountNumber, String accountHolderName, double balance) {
//>>>>>>> b32fe2fb88d3f43a59f3bcb29af7453a8ca8a580
//        this.accountNumber = accountNumber;
//        this.accountHolderName = accountHolderName;
//        this.balance = balance;
//    }
//
//    public int getAccountNo(){
//        return accountNumber;
//    }
//
//    public String getAccountHolderName() {
//        return accountHolderName;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setAccountNumber(int accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public void setAccountHolderName(String accountHolderName) {
//        this.accountHolderName = accountHolderName;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    public void display() {
//        System.out.println("Account Number: " + accountNumber);
//        System.out.println("Account Holder Name: " + accountHolderName);
//        System.out.println("Balance: " + balance);
//    }
//}
//class BankAccount {
//<<<<<<< HEAD
//    ArrayList<Banks> list = new ArrayList<>();
//
//    public void addAccount(Banks bank) {
//=======
//    ArrayList<Bank> list = new ArrayList<>();
//
//    public void addAccount(Bank bank) {
//>>>>>>> b32fe2fb88d3f43a59f3bcb29af7453a8ca8a580
//        list.add(bank);
//    }
//
//    public void displayAllAccounts() {
//<<<<<<< HEAD
//        for (Banks bank : list) {
//=======
//        for (Bank bank : list) {
//>>>>>>> b32fe2fb88d3f43a59f3bcb29af7453a8ca8a580
//            bank.display();
//            System.out.println("-------------------");
//        }
//    }
//
//    public void withdraw(int accountNumber, double amount) {
//<<<<<<< HEAD
//        for (Banks bank : list) {
//=======
//        for (Bank bank : list) {
//>>>>>>> b32fe2fb88d3f43a59f3bcb29af7453a8ca8a580
//            if (bank.getAccountNo() == accountNumber) {
//                if (bank.getBalance() >= amount) {
//                    bank.setBalance(bank.getBalance() - amount);
//                    System.out.println("Withdrawal successful. New balance: " + bank.getBalance());
//                } else {
//                    System.out.println("Insufficient balance.");
//                }
//                return;
//            }
//        }
//        System.out.println("Account not found.");
//    }
//
//    public void deposit(int accountNumber, double amount) {
//<<<<<<< HEAD
//        for (Banks bank : list) {
//=======
//        for (Bank bank : list) {
//>>>>>>> b32fe2fb88d3f43a59f3bcb29af7453a8ca8a580
//            if (bank.getAccountNo() == accountNumber) {
//                bank.setBalance(bank.getBalance() + amount);
//                System.out.println("Deposit successful. New balance: " + bank.getBalance());
//                return;
//            }
//        }
//        System.out.println("Account not found.");
//    }
//}
//
//public class BankAccountMain {
//    static Scanner sc = new Scanner(System.in);
//    public static void main(String args[]){
//        BankAccount bankAccount = new BankAccount();
//
//        do { 
//            System.err.println("Bank Account Management System");
//            System.err.println("1. Add Account\n2. Display All Accounts\n3. Withdraw\n4. Deposit\n5. Exit");
//            System.err.println("Enter your choice: ");
//            int choice = sc.nextInt();
//            switch (choice) {
//                case 1:
//                    System.err.println("Enter account number: ");
//                    int accountNumber = sc.nextInt();
//                    sc.nextLine(); // Consume newline
//                    System.err.println("Enter account holder name: ");
//                    String accountHolderName = sc.nextLine();
//                    System.err.println("Enter initial balance: ");
//                    double balance = sc.nextDouble();
//<<<<<<< HEAD
//                    Banks bank = new Banks(accountNumber, accountHolderName, balance);
//=======
//                    Bank bank = new Bank(accountNumber, accountHolderName, balance);
//>>>>>>> b32fe2fb88d3f43a59f3bcb29af7453a8ca8a580
//                    bankAccount.addAccount(bank);
//                    break;
//                case 2:
//                    bankAccount.displayAllAccounts();
//                    break;
//                case 3:
//                    System.err.println("Enter account number: ");
//                    int accNumWithdraw = sc.nextInt();
//                    System.err.println("Enter amount to withdraw: ");
//                    double amountWithdraw = sc.nextDouble();
//                    bankAccount.withdraw(accNumWithdraw, amountWithdraw);
//                    break;
//                case 4:
//                    System.err.println("Enter account number: ");
//                    int accNumDeposit = sc.nextInt();
//                    System.err.println("Enter amount to deposit: ");
//                    double amountDeposit = sc.nextDouble();
//                    bankAccount.deposit(accNumDeposit, amountDeposit);
//                    break;
//                case 5:
//                    System.out.println("Exiting...");
//                    return;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        } while (true);
//
//    }
//}
package Day8;

import java.util.Scanner;

class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void transaction(double amount) {
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class Deposit extends Account {

    public Deposit(double balance) {
        super(balance);
    }

    @Override
    public void transaction(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }
}

class Withdraw extends Account {

    public Withdraw(double balance) {
        super(balance);
    }

    @Override
    public void transaction(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class problem1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        Account acc;

        if (choice == 1) {
            acc = new Deposit(balance);
        } else {
            acc = new Withdraw(balance);
        }

        acc.transaction(amount);
        acc.checkBalance();

        sc.close();
    }
}

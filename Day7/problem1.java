 package Day7;

import java.util.Scanner;

class Student {
    String name;
    int accNo;
    double balance;

    Student(String name, int accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student("Rupana", 101, 5000);

        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter Amount: ");
            double amt = sc.nextDouble();
            s.deposit(amt);
        } else if (choice == 2) {
            System.out.print("Enter Amount: ");
            double amt = sc.nextDouble();
            s.withdraw(amt);
        } else {
            System.out.println("Invalid Choice");
        }

        s.display();
    }
}


package com.juaracoding;

public class BankAccount {

    int acc_no;
    String name;
    double amount;

    public void setAccount(int a, String n, double amt) {
        acc_no = a;
        name = n;
        amount = amt;
    }

    public double deposit(double amt) {
        amount = amount + amt;
        System.out.println(amt + " deposited");
        return amount;
    }


    public double withdraw(double amt) {
        if (amount < amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + " withdraw");
        }
        return amount;
    }

    public void checkBalance() {
        System.out.println("Balance is: " + amount);
    }

    public void display() {
        BankAccount bankAccount = new BankAccount();
        System.out.println("Customer 1 : " + acc_no + " " + name + " " + amount);

    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccount( 77504, "Budi Farandy", 70000);

        account.display();
        account.checkBalance();

        account.deposit(5000);
        account.checkBalance();

        account.withdraw(25000);
        account.checkBalance();
    }

}

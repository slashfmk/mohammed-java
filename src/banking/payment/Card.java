package banking.payment;

import banking.interfaces.IPay;

import java.util.*;


public abstract class Card implements IPay {

    // attributes
    protected int number;
    protected String name;
    protected int exp_year;
    protected int cvv;
    protected int password;
    protected String type;
    protected Random random;
    protected double balance;

    public static int numOfCards = 0;

    protected Scanner scanner;

    // constructor
    public Card(String name, String type) {
        this.random = new Random();
        this.name = name;
        this.exp_year = random.nextInt(3000) + 2000;
        this.cvv = random.nextInt(999) + 100;
        this.password = 0;
        this.balance = 0;
        this.number = this.random.nextInt(999999999) + 123344445;
        this.type = type;
        this.scanner = new Scanner(System.in);
        numOfCards++;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExp_year() {
        return exp_year;
    }

    public void setExp_year(int exp_year) {
        this.exp_year = exp_year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean spend(double amount) {
        int userPwd;
        boolean success = false;

        System.out.println("Please enter your password ");
        userPwd = scanner.nextInt();

        if (this.checkPassword(userPwd)) {

            if (this.balance >= amount) {
                this.balance -= amount;
                success = true;
            } else {
                System.out.println("You don't have enough money you need $" + Math.abs(this.balance - amount) + " more!");
            }
        } else {
            System.out.println("Wrong password entered!!!!");
        }

        return success;

    }

    public boolean changePassword() {
        int userCurrentPwd;
        boolean success = false;

        System.out.println("Please enter your current password ");
        userCurrentPwd = this.scanner.nextInt();

        if (this.checkPassword(userCurrentPwd)) {
            System.out.println("Please enter your new password ");
            int userNewPwd = this.scanner.nextInt();
            if (userNewPwd <= 9999 && userNewPwd >= 1000) {
                this.password = userNewPwd;
                success = true;
            } else {
                System.out.println("Password must range between 1000 and 9999");
            }
        } else {
            System.out.println("Wrong current password");
        }

        return success;
    }

    protected boolean checkPassword(int pwd) {
        return this.password == pwd;
    }

    public abstract void slogan();

    public String toString() {
        return "Name: " + this.name + " | Balance: " + this.balance + " | #: " + this.number + " | " + this.type;
    }

}

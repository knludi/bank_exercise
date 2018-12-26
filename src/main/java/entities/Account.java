package entities;


import com.sun.org.apache.bcel.internal.generic.RETURN;

public class Account {

    private int number;
    private String holder;
    private double balance;


    public Account(int number, String holder, double initialDeposit){
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);

    }

    public Account(int number, String holder){
        this.number = number;
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }


    public void deposit (double amount){
        balance += balance + amount;
    }

    public void whitdraw (double amount){
        balance -= balance + amount + 5;

    }

    public String toString(){
        return  " Account: "
                + number
                + ", Holder: "
                + holder
                + ", Balance: "
                + balance;

    }
}

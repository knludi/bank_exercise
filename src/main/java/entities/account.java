package entities;


public class account {

    private int number;
    private String holder;
    private double balance;


    account(int number, String holder, double initialDeposit){
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);

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
}

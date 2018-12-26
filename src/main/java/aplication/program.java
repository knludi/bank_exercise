package aplication;

import entities.Account;

import java.util.Scanner;

public class program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter Account number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            sc.nextLine();
            account = new Account(number, holder, initialDeposit);
        }
        else {
            account = new Account(number, holder);

        }
        System.out.println("Account data:" + account);
        System.out.print("Enter a deposit value: ");
        double ammount = sc.nextDouble();
        sc.nextLine();
        account.deposit(ammount);
        System.out.println("Updated Account data:" + account);
        System.out.print("Enter a withdraw value: ");
        ammount = sc.nextDouble();
        sc.nextLine();
        account.whitdraw(ammount);
        System.out.println("Updated Account data:" + account);


        sc.close();
    }
}

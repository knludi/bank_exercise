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

        System.out.print("\nEnter Account holder: ");
        String holder = sc.nextLine();
        sc.nextLine();

        System.out.print("\nIs there na initial deposit (y/n)? ");
        String deposit = sc.nextLine();
        sc.nextLine();

        System.out.print("\nEnter initial deposit value:");
        System.out.print("\nAccount data:" );
        System.out.print("\nEnter a deposit value:");
        System.out.print("\nUpdated Account data:");
        System.out.print("\nEnter a withdraw value:");
        System.out.print("\nUpdated Account data:");


        sc.close();
    }
}

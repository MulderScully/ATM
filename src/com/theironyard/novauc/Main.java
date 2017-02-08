package com.theironyard.novauc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here

        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Welcome, " + name);

        System.out.println("What would you like to do?");

        System.out.println("Check my balance/Withdraw Funds/Cancel]");
        String choice = scanner.nextLine();


        if (choice.equalsIgnoreCase("Check my balance")) {
            System.out.println("Current Balance");
        }
        if (choice.equalsIgnoreCase(" Withdraw Funds")) {
            System.out.println("print balance!");
        } else if (choice.equalsIgnoreCase("Cancel")) {
            System.out.println("Thank you and please come again!");
            throw new Exception("Invalid Choice.");
        } else if (choice.equalsIgnoreCase("Cancel")) {
            System.out.println("Deposit Nothing");
            throw new Exception("Invalid Choice.");

        }
    }
}







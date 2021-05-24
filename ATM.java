package assignment.twelfth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM {
    public static Account[] accounts;

    public static void createAccounts(int numOfAccounts){
        List<Account> accounts = new ArrayList<>();
        Account tempAccount;
        for(int i=0; i<numOfAccounts; i++){
            tempAccount = new Account(i, 100);
            accounts.add(tempAccount);
        }
        ATM.accounts = accounts.toArray(new Account[0]);
    }
    public static int inputID(Scanner scan){
        System.out.println("=== Welcome to the ATM machine ===");
        int id;
        while(true){
            try {
                System.out.print("Enter your ID: ");
                id = scan.nextInt();
                if(id < 0){
                    throw new NumberFormatException();
                }
                else{
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Invalid ID, try again.");
            }
        }
        return id;
    }
    public static int inputOperation(Scanner scan){
        int op;
        while(true){
            try {
                System.out.print("Enter your desired operation: ");
                op = scan.nextInt();
                if(op < 1 || op > 4){
                    throw new NumberFormatException();
                }
                else{
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Invalid operation, try again.");
            }
        }
        return op;
    }
    public static void handleWithdrawals(Scanner scanner, int id){
        int amount = 0;
        while(true){
            try {
                System.out.print("Enter your desired amount to withdraw: ");
                amount = scanner.nextInt();
                if(amount < 1){
                    throw new NumberFormatException();
                }
                else{
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Invalid amount, try again.");
            }
        }
        try{
            ATM.accounts[id].withdraw(amount);
            System.out.println("Withdrawn amount successfully");
        }
        catch (IllegalArgumentException e){
            System.out.println("Insufficient funds, exiting operation");
        }
    }
    public static void handleDeposit(Scanner scanner, int id){
        int amount = 0;
        while(true){
            try {
                System.out.print("Enter your desired amount to deposit: ");
                amount = scanner.nextInt();
                if(amount < 1){
                    throw new NumberFormatException();
                }
                else{
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Invalid amount, try again.");
            }
        }
        ATM.accounts[id].deposit(amount);
        System.out.println("Deposited amount successfully");
    }
    public static void displayMenu(){
        System.out.println(
                """
                        Main Menu:
                        1: Check balance.
                        2: Withdraw
                        3: Deposit
                        4: Exit"""
        );
    }
}
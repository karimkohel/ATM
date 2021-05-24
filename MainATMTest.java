package assignment.twelfth;

import java.util.Scanner;

public class MainATMTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM.createAccounts(10);
        while(true){
            int id = ATM.inputID(scanner);

            ATM.displayMenu();
            int op = ATM.inputOperation(scanner);

            if(op == 1){
                System.out.println("Current Balance : " + ATM.accounts[id].getBalance());
            }
            else if(op == 2) {
                ATM.handleWithdrawals(scanner, id);
            }
            else if(op == 3){
                ATM.handleDeposit(scanner, id);
            }
            else if(op == 4){
                System.out.println("Exiting...");
                break;
            }
            else{
                System.out.println("Invalid operation, try again.");
            }
        }
    }
}

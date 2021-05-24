package assignment.twelfth;

public class MainCheckingTest {
    public static void main(String[] args) {
        Account user1 = new Account(25, 250);
        CheckingAccount user2 = new CheckingAccount(25, 250, 200);

        try{
            user1.withdraw(300);
        }
        catch (IllegalArgumentException e){
            System.out.println("Couldn't withdraw amount out of balance");
        }
        try{
            user2.withdraw(300);
        }
        catch (IllegalArgumentException e){
            System.out.println("Couldn't withdraw amount out of balance");
        }

        System.out.println("Normal account : " + user1.toString());
        System.out.println("Checking account : " + user2.toString());

    }
}

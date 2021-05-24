package assignment.twelfth;

public class MainAccountTest {
    public static void testAccounting(int id, double balance, double air){
        Account testAccount = new Account(id, balance);
        testAccount.setAnnualInterestRate(air);

        testAccount.withdraw(2500);
        testAccount.deposit(3000);

        System.out.println(testAccount);
    }
    public static void main(String[] args) {
        // 9.7 Test
        testAccounting(1122, 20000, 4.5);
    }
}

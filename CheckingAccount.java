package assignment.twelfth;

public class CheckingAccount extends Account {
    private int overdraftLimit;

    public int getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(int overdraftLimit) {
        this.overdraftLimit = -overdraftLimit;
    }

    public CheckingAccount() {
    }

    public CheckingAccount(int overdraftLimit) {
        this.setOverdraftLimit(overdraftLimit);
    }

    public CheckingAccount(int id, double balance, int overdraftLimit) {
        super(id, balance);
        this.setOverdraftLimit(overdraftLimit);
    }

    @Override
    public void withdraw(int amount) {
        if(this.getBalance() - amount >= this.getOverdraftLimit() )
            this.setBalance(this.getBalance() - amount);
        else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return super.toString() + " CheckingAccount{" +
                "overdraftLimit=" + overdraftLimit +
                '}';
    }
}
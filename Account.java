package assignment.twelfth;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private final Date DATE_CREATED = new Date();

    // CONSTRUCTORS
    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    // ACCESSORS, MUTATORS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDATE_CREATED() {
        return DATE_CREATED;
    }

    public void withdraw(int amount){
        if(this.getBalance() - amount >= 0 )
            this.setBalance(this.getBalance() - amount);
        else{
            throw new IllegalArgumentException();
        }
    }

    public void deposit(int amount){
        this.setBalance(this.getBalance() + amount);
    }

    public double getMonthlyInterestRate(){
        return (this.getAnnualInterestRate()/100) / 12;
    }

    public double getMonthlyInterest(){
        return this.getBalance() * this.getMonthlyInterestRate();
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", DATE_CREATED=" + DATE_CREATED +
                '}';
    }
}

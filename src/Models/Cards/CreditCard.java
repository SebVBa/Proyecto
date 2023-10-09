package Models.Cards;

import Models.*;

public class CreditCard extends Card {

    private double balance;
    private double creditLimit;
    private static double interestRate;

    public CreditCard(String number, boolean active) {
        super(number, active);
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public CreditCard(double balance, double creditLimit, String number, boolean active) {
        super(number, active);
        this.balance = balance;
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "CreditCard{" + "balance=" + balance + ", creditLimit=" + creditLimit + '}';
    }

    @Override
    public boolean makePurcharse(Double amount) {
        return amount > this.creditLimit;
    }

    @Override
    public void desactivate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

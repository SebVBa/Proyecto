package Models.Cards;

import Models.Transactions.*;
import Models.*;
import Models.Cards.Account;
import Models.Person.Customer;

public class DollarAcount extends Account {

    private static double exchangeRate;

    public static double getExchangeRate() {
        return exchangeRate;
    }

    public static void setExchangeRate(double exchangeRate) {
        DollarAcount.exchangeRate = exchangeRate;
    }

    public DollarAcount(String number, double balance, Customer customer, boolean active) {
        super(number, balance, customer, active);
    }

    public boolean transfer(Account destination, double amount) {

        return false;

    }

    @Override
    public void activate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void desactivate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

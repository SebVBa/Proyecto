package Models.Cards;

import Models.Transactions.*;
import Models.*;
import Models.Cards.Account;
import Models.Person.Customer;

public class ColonAccount extends Account {

    public ColonAccount(String number, double balance, Customer customer, boolean active) {
        super(number, balance, customer, active);
    }

    @Override
    public void activate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void desactivate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean transfer(Account destination, double amount) {

        return false;

    }

}

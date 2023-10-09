package Models.Transactions;

import Models.Cards.Account;

public class Deposit extends Transaction {

    public Deposit(double amount, Account source) {
        super(amount, source);
    }

    @Override
    public boolean execute() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

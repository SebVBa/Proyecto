package Models.Transactions;

import Models.*;
import Models.Cards.Account;
import Models.Transactions.Transaction;
import java.util.Date;

public class Transfer extends Transaction {

    private Account destination;

    public Transfer(double amount, Account source) {
        super(amount, source);
    }

    public Transfer(Account destination, double amount, Account source) {
        super(amount, source);
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Transfer{" + "destination=" + destination + '}';
    }

    @Override
    public boolean execute() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

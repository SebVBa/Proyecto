package Models.Transactions;

import Models.*;
import Models.Cards.Account;
import Models.Transactions.Transaction;
import java.util.Date;

public class Withdrawal extends Transaction {

    public Withdrawal(double amount, Account source) {
        super(amount, source);
    }

    @Override
    public boolean execute() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

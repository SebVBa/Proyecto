package Models.Transactions;

import Models.Cards.Account;
import java.util.Date;

public abstract class Transaction {

    private double amount;
    private Account source;
    private Date date;

    public double getAmount() {
        return amount;
    }

    public Account getSource() {
        return source;
    }

    public Date getDate() {
        return date;
    }

    public Transaction(double amount, Account source) {
        this.amount = amount;
        this.source = source;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" + "amount=" + amount + ", source=" + source + ", date=" + date + '}';
    }
    public abstract boolean execute();
}

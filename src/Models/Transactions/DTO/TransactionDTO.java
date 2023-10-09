package Models.Transactions.DTO;

import Models.Cards.Account;
import java.util.Date;

public abstract class TransactionDTO {

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

    public TransactionDTO(double amount, Account source) {
        this.amount = amount;
        this.source = source;
        this.date = date;
    }

}

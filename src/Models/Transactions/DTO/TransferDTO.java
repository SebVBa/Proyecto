package Models.Transactions.DTO;

import Models.Cards.Account;
import Models.Transactions.Transaction;

public class TransferDTO extends Transaction {

    private Account destination;

    public TransferDTO(double amount, Account source) {
        super(amount, source);
    }

    public TransferDTO(Account destination, double amount, Account source) {
        super(amount, source);
        this.destination = destination;
    }

    @Override
    public boolean execute() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

package Models.Transactions.DTO;

import Models.Cards.Account;
import Models.Transactions.Transaction;

public class WithdrawalDTO extends Transaction {

    public WithdrawalDTO(double amount, Account source) {
        super(amount, source);
    }

    @Override
    public boolean execute() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

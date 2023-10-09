package Models.Transactions.DTO;

import Models.Transactions.*;
import Models.Cards.Account;

public class DepositDTO extends Transaction {

    public DepositDTO(double amount, Account source) {
        super(amount, source);
    }

    @Override
    public boolean execute() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

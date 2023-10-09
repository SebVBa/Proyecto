package Models.Cards.DTO;

public class DeditCardDTO extends CardDTO {

    private AccountDTO account;

    public AccountDTO getAccount() {
        return account;
    }

    public DeditCardDTO(AccountDTO account, String number, boolean active) {
        super(number, active);
        this.account = account;
    }

}

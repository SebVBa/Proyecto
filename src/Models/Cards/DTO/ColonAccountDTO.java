package Models.Cards.DTO;


import Models.Person.Customer;

public class ColonAccountDTO extends AccountDTO {

    public ColonAccountDTO(String number, double balance, Customer customer, boolean active) {
        super(number, balance, customer, active);
    }

}

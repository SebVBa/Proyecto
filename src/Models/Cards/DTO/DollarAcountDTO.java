package Models.Cards.DTO;

import Models.Person.Customer;

public class DollarAcountDTO extends AccountDTO {

    private static double exchangeRate;

    public static double getExchangeRate() {
        return exchangeRate;
    }

    public DollarAcountDTO(String number, double balance, Customer customer, boolean active) {
        super(number, balance, customer, active);
    }

}

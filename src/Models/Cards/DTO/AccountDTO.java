package Models.Cards.DTO;


import Models.Person.Customer;

public abstract class AccountDTO  {

    private String number;
    private double balance;
    private Customer customer;
    private boolean active;

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public boolean isActive() {
        return active;
    }

    public AccountDTO(String number, double balance, Customer customer, boolean active) {
        this.number = number;
        this.balance = balance;
        this.customer = customer;
        this.active = true;
    }

    @Override
    public String toString() {
        return "Account{" + "number=" + number + ", balance=" + balance + ", customer=" + customer + ", active=" + active + '}';
    }

}

package Models.Cards;

import Models.*;

public abstract class Card implements StatusControl{

    private String number;
    private boolean active;

    public String getNumber() {
        return number;
    }

    public boolean isActive() {
        return active;
    }

    public Card(String number, boolean active) {
        this.number = number;
        this.active = false;
    }

    @Override
    public String toString() {
        return "Card{" + "number=" + number + ", active=" + active + '}';
    }

    public void activate() {
        this.active = true;
    }

    public void deactivate() {

        this.active = false;
    }

    public abstract boolean makePurcharse(Double amount);
}

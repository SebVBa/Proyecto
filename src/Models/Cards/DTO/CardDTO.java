package Models.Cards.DTO;


public abstract class CardDTO{

    private String number;
    private boolean active;

    public String getNumber() {
        return number;
    }

    public boolean isActive() {
        return active;
    }

    public CardDTO(String number, boolean active) {
        this.number = number;
        this.active = false;
    }

    @Override
    public String toString() {
        return "Card{" + "number=" + number + ", active=" + active + '}';
    }

}

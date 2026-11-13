package vegasbaby;

public class Playa {
    private String name;
    private Hand hand;

    public Playa(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + " " + this.hand.getValue() + " -  " + this.hand.toString();
    }

    /**
     * Adds a card to the player's hand
     * @param card the card to add
     */
    public void takeCard(Card card) {
        this.hand.addCard(card);
    }

}

package vegasbaby;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    // A Card is dealt to the Hand and the Hand is responsible
// to store the card
    public void addCard(Card c) {
        this.cards.add(c);
    }

    public int getSize() {
        return cards.size();
    }

    // The Hand uses the methods of each card to determine
// the value of each card - and adds up all values
    public int getValue() {
        int value = 0;
        for (Card card : cards) {
            value += card.getPointValue();
        }
        return value;
    }

    public void display() {
        String results = "";
        for (int i = 0; i < this.cards.size(); i++) {
            Card c = this.cards.get(i);
            results += c.getSuit() + c.getValue();

            if (i != this.cards.size() - 1) {
                results += ", ";
            }
        }
        System.out.println(results);
    }

    @Override
    public String toString() {
        String results = "";

        for (int i = 0; i < this.cards.size(); i++) {

            Card c = this.cards.get(i);

            results += c.getValue() + " of " + c.getSuit();

            if (i != this.cards.size() - 1) {
                results += ", ";
            }
        }
        return results;
    }
}
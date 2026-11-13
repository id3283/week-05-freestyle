package vegasbaby;

public class Card {
    private String suit;
    private String value;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        // only return the suit if the card is face up
        return this.suit;
    }

    public String getValue() {
        // only return the value if the card is face up
        // this is the string value of the card
        // i.e. A, K, Q, J, 10, 9 ...
        return this.value;
    }

    public int getPointValue() {
        // only return the value if the card is face up
        // done: determine point value and return it
        // A = 11
        // K, Q, J = 10
        // all numeric cards are equal to their face value
        switch (this.value) {
            case "2", "3", "4", "5", "6", "7", "8", "9", "10" -> {
                return Integer.parseInt(this.value);
            }
            case "J", "Q", "K" -> {
                return 10;
            }
            case "A" -> {
                return 11;
            }
            default -> {
                throw new RuntimeException("Unknown card value");
            }
        }
    }
}
package vegasbaby;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        Deck dealersDeck = new Deck();
        dealersDeck.shuffle();

        ArrayList<Playa> players = new ArrayList<>();
        players.add(new Playa("Yahir"));
        players.add( new Playa("Samin") );
        players.add( new Playa("Dave") );
        players.add( new Playa("Nate") );
        players.add( new Playa("Aidana") );

        for( Playa p : players) {
            p.takeCard(dealersDeck.deal());
            p.takeCard(dealersDeck.deal());
        }

        for( Playa p : players) {
            System.out.println(p.toString());
        }

    }
}
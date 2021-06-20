package lesson8.blackjack;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand = new ArrayList<>();

    public void saveCardToHand(Card card) {
        hand.add(card);
    }

    public void printCardsInHand() {
        for (Card c : hand) {
            c.printCard();
        }
    }

    public int countValueInHand() {
        int sum = 0;
        for (Card c : hand) {
            sum = sum + c.getValue();
        }
        return sum;
    }
}

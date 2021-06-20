package lesson8.blackjack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Game {
    private Coloda coloda = new Coloda();
    private ArrayList<Player> players = new ArrayList<>();

    public void addPlayerToGame(Player player) {
        players.add(player);
    }

    public void addTwoCardsToPlayers() {
        for (Player p : players) {
            Card randomCard = coloda.randomCard();
            p.saveCardToHand(randomCard);

            Card randomCard2 = coloda.randomCard();
            p.saveCardToHand(randomCard2);
        }
    }

    public void addCardsTillNeed(Player player) {
        player.printCardsInHand();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нужна ли ещё одна карта?(да/нет)");
        String answer = scanner.nextLine();
        if (answer.equals("да")) {
            Card card = coloda.randomCard();
            player.saveCardToHand(card);
            addCardsTillNeed(player);
        }
    }

    public void addCardsTillNeed(Dealer dealer) {
        if (dealer.countValueInHand() < 18) {
            Card card = coloda.randomCard();
            dealer.saveCardToHand(card);
            addCardsTillNeed(dealer);
        }
    }

    public void printWinner(Player player, Dealer dealer) {
        if (player.countValueInHand() > 21) {
            System.out.println("Выиграл крупье!");
            dealer.printCardsInHand();
            return;
        }

        if (player.countValueInHand() <= 21 && dealer.countValueInHand() > 21) {
            System.out.println("Поздравляем, Вы выиграли!");
            player.printCardsInHand();
            return;
        }

        if (player.countValueInHand() >= dealer.countValueInHand()) {
            System.out.println("Поздравляем, Вы выиграли!");
            player.printCardsInHand();
        } else {
            System.out.println("Выиграл крупье!");
            dealer.printCardsInHand();
        }
    }
}

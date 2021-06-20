package lesson8.blackjack;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Dealer dealer = new Dealer();

        Game game = new Game();
        game.addPlayerToGame(player);
        game.addPlayerToGame(dealer);

        game.addTwoCardsToPlayers();

        game.addCardsTillNeed(player);
        game.addCardsTillNeed(dealer);

        game.printWinner(player, dealer);
    }
}

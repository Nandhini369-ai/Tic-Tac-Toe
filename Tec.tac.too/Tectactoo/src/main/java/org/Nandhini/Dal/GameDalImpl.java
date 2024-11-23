package org.Nandhini.Dal;

import org.Nandhini.Model.Player;

public class GameDalImpl {
    private final Player player1;
    private final Player player2;
    private Player currentPlayer;

    public GameDalImpl(Player player1, Player player2) { // Correct constructor name
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1; // Start with player1
    }

    public void setPlayer1(Player player) {
    }

    public void setPlayer2(Player player) {
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void switchCurrentPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }
}

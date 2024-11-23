package org.Nandhini.Dal;

import org.Nandhini.Model.Player;

public class PlayerDalImpl implements PlayerDal {
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public PlayerDalImpl(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
        this.currentPlayer = player1;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;       // Update player 2
    }

    public void switchCurrentPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1; // Toggle current player
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }
}

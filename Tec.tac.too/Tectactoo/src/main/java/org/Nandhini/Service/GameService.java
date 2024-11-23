package org.Nandhini.Service;

import org.Nandhini.Dal.BoardDal;
import org.Nandhini.Dal.PlayerDal;
import org.Nandhini.Model.Game;
import org.Nandhini.Model.Player;

public class GameService {
    private PlayerDal playerDal;
    private BoardDal boardDal;
    private Game game;

    public GameService(PlayerDal playerDal, BoardDal boardDal) {
        this.playerDal = playerDal;
        this.boardDal = boardDal;
    }

    public GameService(int boardSize) {
        this.game = new Game(boardSize); // Ensure this line correctly initializes the Game object
        game.init();
    }

    public void startNewGame(Player player1, Player player2) {
        playerDal.setPlayer1(player1);
        playerDal.setPlayer2(player2);
        boardDal.initializeBoard();
    }

    public void makeMove(int row, int col) {
        Player currentPlayer = playerDal.getCurrentPlayer();
        if (boardDal.isValidMove(row, col)) {
            boardDal.makeMove(row, col, currentPlayer.getSymbol());
        }
    }

    public boolean checkForWinner() {
        return boardDal.hasWinner();
    }

    public boolean isBoardFull() {
        return boardDal.isFull();
    }

    public boolean isGameDraw() {
        return boardDal.isDraw();
    }

    public void switchPlayer() {
        playerDal.switchCurrentPlayer();
    }

    public Player getCurrentPlayer() {
        return playerDal.getCurrentPlayer();
    }

    public Game getGame() {
        return this.game; // Assuming 'game' is a field in your class
    }

    public void playGame() {
    }

    public class Game {
        private int boardSize;

        public Game(int boardSize) {
            this.boardSize = boardSize;
            // Initialize other necessary game state here
        }

        public void init() {
            // Any additional initialization logic
        }
    }
}

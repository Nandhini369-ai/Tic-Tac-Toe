package org.Nandhini.Model;

public class Game {
    private Player player1;
    private Player player2;
    private final Board board;
    private Player currentPlayer;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = new Board();
        this.currentPlayer = player1; // Set the first player
    }

    public Game(Player player1, Player player2, Board board) {

        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
    }
    public Board getBoard() {
        return board;
    }
    public void initializePlayers() {
        player1 = new Player();
        player2 = new Player();
    }


    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

        public void init() {
            // Initialize players or game state here
        }

        public void play() {
            // Logic for playing the game goes here
        }

        public Player getPlayer1() {
            return player1; // Return the player1 instance
        }

        public Player getPlayer2() {
            return player2; // Return the player2 instance
        }
    }

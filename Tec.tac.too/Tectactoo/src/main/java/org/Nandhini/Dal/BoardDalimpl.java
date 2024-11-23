package org.Nandhini.Dal;

import org.Nandhini.Model.Board;

public class BoardDalimpl {
    private Board board;

    public BoardDalimpl() {
        board = new Board();
    }

    public void initializeBoard() { // Change return type to void
        board.resetBoard();
    }

    public boolean isValidMove(int row, int col) {
        return board.isValidMove(row, col);
    }

    public boolean hasWinner() {
        return board.hasWinner(); // Check for a winner
    }

    public boolean isFull() {
        return board.isFull(); // Check if the board is full
    }

    public boolean isDraw() {
        return isFull() && !hasWinner();
    }
}
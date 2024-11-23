package org.Nandhini.Service;

import org.Nandhini.Dal.BoardDal;

public class BoardService {
    private final BoardDal boardDal;
    public char currentPlayer;

    public BoardService(BoardDal boardDal) {
        this.boardDal = boardDal;
    }

    public void initializeBoard() {
        boardDal.initializeBoard();
    }

    public boolean isValidMove(int row, int col) {
        return boardDal.isValidMove(row, col);
    }

    public boolean hasWinner() {
        return boardDal.hasWinner();
    }

    public boolean isFull() {
        return boardDal.isFull();
    }

    public boolean isDraw() {
        return isFull() && !hasWinner();
    }

    public void displayBoard() {
    }

    public boolean makeMove(int row, int col) {
        // Check if the move is valid
        double[][] board = new double[0][];
        return false; // Move was invalid
    }

}


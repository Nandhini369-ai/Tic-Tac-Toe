package org.Nandhini.Dal;

public interface BoardDal {
    void initializeBoard();
    boolean makeMove(int row,int col,char symbol);
    boolean isValidMove(int row,int col);
    boolean hasWinner();
    boolean isDraW();

    boolean isFull();

    boolean isDraw();
}

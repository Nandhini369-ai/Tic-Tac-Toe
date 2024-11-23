package org.Nandhini.Model;

import org.Nandhini.Service.BoardService;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Board {
    private char[][] grid;
    private char[][] size; // This may not be necessary based on your context

    public Board() {
        grid = new char[3][3]; // Initialize a 3x3 grid
        size = new char[3][3]; // If you need it, otherwise you can remove this
    }

    public char[][] getGrid() {
        return grid;
    }

    public void setGrid(char[][] newGrid) {
        if (newGrid.length != 3 || newGrid[0].length != 3) {
            throw new IllegalArgumentException("Grid must be 3x3!");
        }
        this.grid = newGrid;
    }

    public char[][] getSize() {
        return size;
    }

    public void setSize(char[][] newSize) {
        this.size = newSize;
    }

    public void resetBoard() {
    }

    public boolean isValidMove(int row, int col) {
        return false;
    }

    public boolean hasWinner() {
        return false;
    }

    public boolean isFull() {
        char[][] capacity = new char[0][];
        return Arrays.deepEquals(size, capacity);
    }
}
package org.Nandhini;

import org.Nandhini.Model.Player;
import org.Nandhini.Service.GameService;
import org.Nandhini.Service.PlayerService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter board size (e.g., for a 3x3 grid, enter 3):");
        int boardSize = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        GameService gameService = new GameService(boardSize);
        System.out.println("Game initialized: " + (gameService.getGame() != null)); // Check if Game is initialized

        PlayerService playerService = new PlayerService();

        System.out.print("Enter name for Player 1 (X): ");
        String player1Name = scanner.nextLine();
        Player player1 = playerService.createPlayer(player1Name, 'X');

        System.out.print("Enter name for Player 2 (O): ");
        String player2Name = scanner.nextLine();
        Player player2 = playerService.createPlayer(player2Name, 'O');

        gameService.getGame().getClass(); // Ensure setPlayers method exists
        gameService.playGame(); // Start the game
    }
}

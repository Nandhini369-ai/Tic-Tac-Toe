package org.Nandhini.Service;

import org.Nandhini.Dal.PlayerDal;
import org.Nandhini.Model.Player;

public class PlayerService {
    private PlayerDal playerDal = null;

    public PlayerService() {
        this.playerDal = playerDal;
    }

    public Player getCurrentPlayer() {
        return playerDal.getCurrentPlayer();
    }

    public Player createPlayer(String playerName, char symbol) {
        Player player = new Player(); // Create a new Player instance
        player.setName(playerName);   // Set the player's name
        player.setSymbol(symbol);      // Set the player's symbol (X or O)
        return player;                 // Return the Player object
    }
}


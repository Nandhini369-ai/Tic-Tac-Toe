package org.Nandhini.Dal;

import org.Nandhini.Model.Player;

public interface PlayerDal {
    Player getCurrentPlayer();
    void setPlayer1(Player player1);
    void setPlayer2(Player player2);
    void switchCurrentPlayer();
}

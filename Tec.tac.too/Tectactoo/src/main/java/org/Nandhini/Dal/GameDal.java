package org.Nandhini.Dal;

import org.Nandhini.Model.Player;

public interface GameDal {
        void setPlayer1(Player player);
        void setPlayer2(Player player);
        Player getCurrentPlayer();
        void switchCurrentPlayer();
    }



package com.company.strategies.gamewinningstrategy;

import com.company.models.Board;
import com.company.models.Cell;
import com.company.models.Player;

public interface GameWinningStrategy {
    boolean checkWinner(Board board,
                        Player lastMovePlayer,
                        Cell moveCell);
}

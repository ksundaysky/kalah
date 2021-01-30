package com.ksundaysky.kalah;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Game {
    private final static int NUMBER_OF_HOUSES = 6;
    private final static int NUMBER_OF_ALL_HOUSES_AND_KALAHS = (NUMBER_OF_HOUSES * 2) + 2;
    private final static int NUMBER_OF_SEEDS = 6;

    private final int id;
    private final List<Pit> board;

    //  This will apply only if NUMBER_OF_HOUSES will be 6
    //  6-th pit is first player kalah and 13-th pit is second player kalah
    //      12 11 10 9  8  7
    //   13                  6
    //      0  1  2  3  4  5
    Game() {
        this.id = new Random(100).nextInt();
        this.board = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_ALL_HOUSES_AND_KALAHS; i++) {
            // Add Kalah on n-th position and 2*n-1 position
            if (i == NUMBER_OF_HOUSES || i == NUMBER_OF_ALL_HOUSES_AND_KALAHS - 1) {
                this.board.add(new Pit(0));
            }
            this.board.add(new Pit(NUMBER_OF_SEEDS));
        }
    }

    List<Pit> listBoardPits(){
        return board;
    }

}

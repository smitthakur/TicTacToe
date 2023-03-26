package com.company.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> board;

    public Board(int dimension){
        this.board=new ArrayList<>();

        for(int i=0;i<dimension;i++){
            this.board.add(new ArrayList<>());
            for(int j=0;j<dimension;j++){
                //add cell; this.board.get(i).add(//cell);
            }
        }
    }
}

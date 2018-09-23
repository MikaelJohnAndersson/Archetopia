package com.mygdx.archetopia.entities;

import com.mygdx.archetopia.constants.Values;

public class Player {

    private int posX, posY;

    public Player(){
        this.posX = Values.PLAYER_DEFAULT_POS_X;
        this.posY = Values.PLAYER_DEFAULT_POS_Y;
    }

    public Player(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}

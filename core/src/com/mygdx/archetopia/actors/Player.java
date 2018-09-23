package com.mygdx.archetopia.actors;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.archetopia.constants.VALUES;

public class Player extends Actor{

    private Texture sprite;

    public Player(){
        sprite = new Texture("badlogic.jpg");
        setX((VALUES.APP_WIDTH / 2) - (this.sprite.getWidth() /2));
        setY((VALUES.APP_HEIGHT / 2) - (this.sprite.getHeight() /2));
    }


    @Override
    public void act(float delta) {
        super.act(delta);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        batch.draw(this.sprite, getX(), getY());
    }
}

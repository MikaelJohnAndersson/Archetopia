package com.mygdx.archetopia.actors;

import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.archetopia.helpers.CONSTANTS;

public class Player extends Entity{

    public Player(World world){
        super(world, CONSTANTS.PLAYER_SPRITE);
    }
}

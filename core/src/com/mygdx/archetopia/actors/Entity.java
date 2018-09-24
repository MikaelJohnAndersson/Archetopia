package com.mygdx.archetopia.actors;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.*;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.archetopia.helpers.CONSTANTS;

public class Entity extends Actor {

    protected Sprite sprite;
    private World world;
    private Body body;

    public Entity(World world, String sprite) {

        this.world = world;
        this.sprite = new Sprite(new Texture(sprite));

        //Default position middle of screen
        this.setPosition((CONSTANTS.APP_WIDTH / 2) - (this.sprite.getWidth() /2), (CONSTANTS.APP_HEIGHT / 2) - (this.sprite.getHeight() /2));

        createBody();
    }

    public void createBody(){
        BodyDef bodyDef = new BodyDef();
        //Setting type to kinematic body (Not affected by gravity)
        bodyDef.type = BodyDef.BodyType.KinematicBody;
        bodyDef.position.set(this.getX(), this.getY());

        this.body = this.world.createBody(bodyDef);

        PolygonShape shape = new PolygonShape();
        shape.setAsBox(this.sprite.getWidth() / 2, this.sprite.getHeight() / 2);
        FixtureDef fixtureDef = new FixtureDef();
        fixtureDef.shape = shape;
        fixtureDef.density = 1;

        Fixture fixture = body.createFixture(fixtureDef);

        shape.dispose();
    }

    @Override
    public void act(float delta) {
        this.setPosition(this.body.getPosition().x, this.body.getPosition().y);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        batch.draw(this.sprite, getX(), getY());
    }
}

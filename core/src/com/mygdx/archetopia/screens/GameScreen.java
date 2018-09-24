package com.mygdx.archetopia.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.mygdx.archetopia.actors.Player;

public class GameScreen implements Screen{

    private Stage stage;
    private Player player;
    private World world;

    public GameScreen(){
        create();
    }

    public void create(){
        world = new World(new Vector2(0, 0), true);
        stage = new Stage();
        player = new Player(world);
        stage.addActor(player);
    }

    @Override
    public void render(float delta) {
        stage.act(delta);
        stage.draw();

        world.step(Gdx.graphics.getDeltaTime(), 6, 2);
    }

    @Override
    public void show() {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        stage.dispose();
    }
}

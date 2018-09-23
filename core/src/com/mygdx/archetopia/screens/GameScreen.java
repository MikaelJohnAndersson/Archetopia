package com.mygdx.archetopia.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.mygdx.archetopia.actors.Player;

public class GameScreen implements Screen{

    private SpriteBatch batch;
    private Stage stage;
    private Player player;

    public GameScreen(){
        create();
    }

    public void create(){

        stage = new Stage();
        batch = new SpriteBatch();
        player = new Player();

        stage.addActor(player);
    }

    @Override
    public void render(float delta) {
        stage.act(delta);
        stage.draw();
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
        batch.dispose();
        stage.dispose();
    }
}

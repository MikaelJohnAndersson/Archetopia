package com.mygdx.archetopia;

import com.badlogic.gdx.Game;
import com.mygdx.archetopia.screens.GameScreen;

//Entry point for the application
public class Main extends Game {

	//Called on application start
	@Override
	public void create() {
		//Creating gamescreen and attaching it to Game
		GameScreen gs = new GameScreen();
		setScreen(gs);
	}

}

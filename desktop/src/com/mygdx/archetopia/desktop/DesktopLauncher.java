package com.mygdx.archetopia.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.archetopia.Main;
import com.mygdx.archetopia.helpers.CONSTANTS;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.width = CONSTANTS.APP_WIDTH;
		config.height = CONSTANTS.APP_HEIGHT;

		new LwjglApplication(new Main(), config);
	}
}

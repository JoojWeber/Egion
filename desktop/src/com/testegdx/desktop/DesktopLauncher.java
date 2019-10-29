package com.testegdx.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.testegdx.Egion;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.foregroundFPS = 60;
		config.width = Egion.SCREEN_WIDTH;
		config.height = Egion.SCREEN_HEIGHT;
		config.resizable = false;
		new LwjglApplication(new Egion(), config);
	}
}

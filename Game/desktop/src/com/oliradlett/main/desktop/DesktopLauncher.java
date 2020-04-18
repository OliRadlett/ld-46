package com.oliradlett.main.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.oliradlett.main.Game;

public class DesktopLauncher {

	public static void main (String[] arg) {

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = "LD 46";
		config.width = 800;
		config.height = 600;
		config.backgroundFPS = 0;
		config.foregroundFPS = 60;
		config.fullscreen = false;
		config.resizable = false;
		config.vSyncEnabled = true;
		config.pauseWhenBackground = true;
		config.pauseWhenMinimized = true;


		new LwjglApplication(new Game(), config);

	}

}

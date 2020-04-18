package com.oliradlett.main;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.oliradlett.core.ScreenManager;
import com.oliradlett.menu.MainMenu;

public class Game extends com.badlogic.gdx.Game {

	MainMenu menu;
	ScreenManager screenManager;


	@Override
	public void create () {

		screenManager = new ScreenManager(this);
		menu = new MainMenu(this);
		screenManager.SetScreen(menu);

	}

	@Override
	public void render () {

		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		this.screen.render(Gdx.graphics.getDeltaTime());

	}

	@Override
	public void dispose () {

	}

}
package com.testegdx;

import Menu.MenuPrincipal;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import tela.TelaJogo;

public class Egion extends Game {

	public SpriteBatch batch;
	public static final int SCREEN_WIDTH = 680,SCREEN_HEIGHT = 680;

	@Override
	public void create() {
		batch = new SpriteBatch();
		this.setScreen(new MenuPrincipal(this));
	}

	@Override
	public void render() {
		super.render();
	}
}

package com.testegdx;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import tela.TelaJogo;

public class Egion extends Game {

	public SpriteBatch batch;
	public static final int SCREEN_WIDTH = 688,SCREEN_HEIGHT = 688;

	@Override
	public void create() {
		batch = new SpriteBatch();
		this.setScreen(new TelaJogo(this));
	}

	@Override
	public void render() {
		super.render();
	}

}

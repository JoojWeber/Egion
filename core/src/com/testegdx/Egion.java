package com.testegdx;

import Menu.MenuPrincipal;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import tela.TelaJogo;

public class Egion extends Game {

	public SpriteBatch batch;
	public static final int SCREEN_WIDTH = 680,SCREEN_HEIGHT = 680;
	public MenuPrincipal menu;

	@Override
	public void create() {
		batch = new SpriteBatch();
		menu = new MenuPrincipal(this);
		this.setScreen(new MenuPrincipal(this));
        if (menu.getJogar().verificaClick(this.batch)) {
            this.setScreen(new TelaJogo(this));
        }
	}

	@Override
	public void render() {
		super.render();
	}
}

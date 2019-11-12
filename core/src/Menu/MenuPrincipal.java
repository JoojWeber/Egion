package Menu;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.testegdx.Egion;
import tela.TelaJogo;

public class MenuPrincipal implements Screen {

    public Botao getJogar() {
        return jogar;
    }

    private Egion game;
    private Botao jogar, opcoes, sair;
    private Sprite paredeFundo, muralFundo, logo, calice;

    public MenuPrincipal(Egion game) {
        this.game = game;
        paredeFundo = new Sprite(new Texture("botoes_img/teste.png"));
        muralFundo = new Sprite(new Texture("botoes_img/botao2.jpg"));
        jogar = new Botao(75, 325, 250, 70, new Texture("botoes_img/teste.png"), new Texture("botoes_img/botao2.jpg"));
        opcoes = new Botao(75, 240, 250, 70, new Texture("botoes_img/teste.png"), new Texture("botoes_img/botao1.jpg"));
        sair = new Botao(75, 155, 250, 70, new Texture("botoes_img/teste.png"), new Texture("botoes_img/botao2.jpg"));
        logo = new Sprite(new Texture("botoes_img/teste.png"));
        calice = new Sprite(new Texture("botoes_img/teste.png"));

        paredeFundo.setSize(680, 680);
        muralFundo.setSize(580, 480);
        logo.setSize(400, 150);
        calice.setSize(250, 240);

        muralFundo.setCenter(340, 365);
        logo.setCenter(340, 500);
        calice.setCenter(480, 275);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        game.batch.begin();
        paredeFundo.draw(game.batch);
        muralFundo.draw(game.batch);
        logo.draw(game.batch);
        calice.draw(game.batch);

        jogar.desenhaBotao(game.batch);
        opcoes.desenhaBotao(game.batch);
        sair.desenhaBotao(game.batch);

        jogar.verificaMouse(game.batch);
        opcoes.verificaMouse(game.batch);
        sair.verificaMouse(game.batch);
        game.batch.end();
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

    }
}

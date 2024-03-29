package Menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.testegdx.Egion;
import tela.TelaJogo;

public class MenuPrincipal implements Screen {

    private Egion game;
    public Botao jogar;
    private Botao opcoes;
    private Botao sair;
    private Sprite paredeFundo, muralFundo, logo, calice, calice2;
    private Music musica;

    public MenuPrincipal(Egion game) {
        this.game = game;
        paredeFundo = new Sprite(new Texture("botoes_img/parede.png"));
        muralFundo = new Sprite(new Texture("botoes_img/mural.png"));
        jogar = new Botao(100, 330, 200, 70, new Texture("botoes_img/jogarInativo.png"), new Texture("botoes_img/jogarAtivo.png"));
        opcoes = new Botao(100, 245, 200, 70, new Texture("botoes_img/opcoes.png"), new Texture("botoes_img/opcoesAtivo.png"));
        sair = new Botao(100, 160, 200, 70, new Texture("botoes_img/sair.png"), new Texture("botoes_img/sairAtivo.png"));
        logo = new Sprite(new Texture("botoes_img/logo.png"));
        calice = new Sprite(new Texture("botoes_img/folha.png"));
        calice2 = new Sprite(new Texture("botoes_img/calice2.png"));

        paredeFundo.setSize(1080, 680);
        muralFundo.setSize(580, 480);
        logo.setSize(400, 150);
        calice.setSize(250, 240);

        muralFundo.setCenter(340, 365);
        logo.setCenter(340, 490);
        calice.setCenter(460, 280);
        calice2.setCenter(500, 255);
        calice2.setSize(300, 180);

        musica = Gdx.audio.newMusic(Gdx.files.internal("musica.mp3"));
        musica.setLooping(true);
        musica.play();
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

        if(jogar.verificaClick(game.batch)) {
            game.setScreen(new TelaJogo(game));
        }

        if(sair.verificaClick(game.batch)) {
            Gdx.app.exit();
        }

        if(opcoes.verificaClick(game.batch)) {
            game.setScreen(new MenuConfig(game));
        }
        calice2.draw(game.batch);
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

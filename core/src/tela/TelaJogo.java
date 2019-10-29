package tela;

import Menu.Botao;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.testegdx.Egion;
import controles.Teclado;
import jogador.Jogador;

public class TelaJogo implements Screen {

    private SpriteBatch batch;
    private Jogador jogador;
    private Teclado tecla;
    private TiledMap mapa;
    private OrthogonalTiledMapRenderer renderer;
    private OrthographicCamera cam;

    private Egion jogo;

    public TelaJogo(Egion jogo) {
        this.jogo = jogo;
        tecla = new Teclado(Input.Keys.UP, Input.Keys.DOWN, Input.Keys.LEFT, Input.Keys.RIGHT);
        jogador = new Jogador(new Texture("botoes_img/botao.jpg"));


    }

    @Override
    public void show() {
        mapa = new TmxMapLoader().load("mapas/mapaTeste.tmx");
        renderer = new OrthogonalTiledMapRenderer(mapa);

        cam = new OrthographicCamera();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        jogador.move(tecla);

        cam.position.set(jogador.getX(),jogador.getY(),0);
        cam.update();
        renderer.render();
        renderer.setView(cam);

        jogo.batch.begin();
        jogador.draw(jogo.batch);
        jogo.batch.end();
    }

    @Override
    public void resize(int width, int height) {
        cam.viewportWidth = width;
        cam.viewportHeight = height;
        cam.update();
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
        mapa.dispose();
        renderer.dispose();
    }
}

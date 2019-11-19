package tela;

import Menu.Botao;
import Menu.Hud;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.objects.CircleMapObject;
import com.badlogic.gdx.maps.objects.EllipseMapObject;
import com.badlogic.gdx.maps.objects.PolygonMapObject;
import com.badlogic.gdx.maps.objects.PolylineMapObject;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTile;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer.Cell;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.maps.tiled.tiles.AnimatedTiledMapTile;
import com.badlogic.gdx.maps.tiled.tiles.StaticTiledMapTile;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Ellipse;
import com.badlogic.gdx.math.Polygon;
import com.badlogic.gdx.math.Polyline;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;
import com.testegdx.Egion;
import jogador.Jogador;


public class TelaJogo implements Screen {

    private SpriteBatch batch;
    private Jogador jogador;
    private TiledMap mapa;
    private OrthogonalTiledMapRenderer renderer;
    private OrthographicCamera cam;
    private Hud hud;

    private Egion jogo;

    public TelaJogo(Egion jogo) {
        this.jogo = jogo;
        jogador = new Jogador(new Texture("personagens/arqueiro.jpg"));
    }

    @Override
    public void show() {
        mapa = new TmxMapLoader().load("mapas/mapaTeste.tmx");
        renderer = new OrthogonalTiledMapRenderer(mapa);
        cam = new OrthographicCamera();
        hud = new Hud(100);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        jogador.move();

        cam.position.set(jogador.getPos_x(),jogador.getPos_y(),0);
        cam.update();
        renderer.render();
        renderer.setView(cam);

        renderer.getBatch().begin();
        jogador.desenha(renderer.getBatch());
        renderer.getBatch().end();
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

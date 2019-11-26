package Menu;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.testegdx.Egion;


public class Hudi {
    public Stage stage;
    private Viewport viewport;

    private Integer timer;
    private float contador;
    private Integer pontos;

    Label labelContador;
    Label labelPontos;
    Label labelTempo;
    Label labelNivel;
    Label labelMundo;
    Label labelMario;

    public Hudi(SpriteBatch sb) {
       timer = 300;
       contador = 0;
       pontos = 0;

       viewport = new FitViewport(Egion.SCREEN_WIDTH, Egion.SCREEN_WIDTH, new OrthographicCamera());
       stage = new Stage(viewport, sb);

       Table table = new Table();
       table.top();
       table.setFillParent(true);

       labelContador = new Label(String.format("%03d", timer), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
       labelPontos = new Label(String.format("%06d", pontos), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
       labelTempo = new Label("Tempo", new Label.LabelStyle(new BitmapFont(), Color.WHITE));
       labelNivel = new Label("1-1", new Label.LabelStyle(new BitmapFont(), Color.WHITE));
       labelMundo = new Label("Mundo", new Label.LabelStyle(new BitmapFont(), Color.WHITE));
       labelMario = new Label("Mario", new Label.LabelStyle(new BitmapFont(), Color.WHITE));

       table.add(labelMario).expandX().padTop(10);
       table.add(labelMundo).expandX().padTop(10);
       table.add(labelTempo).expandX().padTop(10);
       table.row();
       table.add(labelPontos).expandX();
       table.add(labelNivel).expandX();
       table.add(labelContador).expandX();

       stage.addActor(table);
    }


}

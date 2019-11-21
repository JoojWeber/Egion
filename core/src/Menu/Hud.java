package Menu;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.testegdx.Egion;

public class Hud {

    private int hp;
    private Sprite barraHp;
    private Egion game;

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Hud(int vida) {
        this.game = game;
        hp = vida;
        barraHp = new Sprite(new Texture("botoes_img/barraHp.png"));

    }

    public void desenhaBarraVida() {
        barraHp.draw(game.batch);
    }
}

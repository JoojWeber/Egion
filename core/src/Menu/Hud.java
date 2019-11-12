package Menu;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Hud {

    private int hp;
    private Sprite barraHp;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Sprite getBarraHp() {
        return barraHp;
    }

    public void setBarraHp(Sprite barraHp) {
        this.barraHp = barraHp;
    }

    public Hud(int hp) {
        setHp(hp);
        setBarraHp(new Sprite(new Texture("barraHp.png")));
        getBarraHp().setOrigin(650, 10);
        getBarraHp().setScale(120, 20);
    }
}

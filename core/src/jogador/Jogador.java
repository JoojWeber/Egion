package jogador;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.testegdx.Egion;
import com.badlogic.gdx.Gdx;
import controles.Controle;
import controles.Teclado;

public class Jogador extends Sprite {

    private float speed = 420,
                  x = 0,
                  y = 0;

    public Controle controle;

    public Jogador(Texture tex) {
        super(tex);
        setSize(16, 16);
        setCenterX(Egion.SCREEN_WIDTH / 2);
        setCenterY(Egion.SCREEN_HEIGHT / 2);
        controle = new Teclado(Input.Keys.UP, Input.Keys.DOWN, Input.Keys.LEFT, Input.Keys.RIGHT);
    }

    public void move() {
        if (controle.esqCima()) {
            x -= (int) (getSpeed() * Math.sqrt(2) / 2);
            y += (int) (getSpeed() * Math.sqrt(2) / 2);
        } else if (controle.esqBaixo()) {
            x -= (int) (getSpeed() * Math.sqrt(2) / 2);
            y -= (int) (getSpeed() * Math.sqrt(2) / 2);
        } else if (controle.dirBaixo()) {
            x += (int) (getSpeed() * Math.sqrt(2) / 2);
            y -= (int) (getSpeed() * Math.sqrt(2) / 2);
        } else if (controle.dirCima()) {
            x += (int) (getSpeed() * Math.sqrt(2) / 2);
            y += (int) (getSpeed() * Math.sqrt(2) / 2);
        } else if (controle.segCima()) {
            y += getSpeed();
        } else if (controle.segBaixo()) {
            y -= getSpeed();
        } else if (controle.segEsquerda()) {
            x -= getSpeed();
        } else if (controle.segDireita()) {
            x += getSpeed();
        }
    }


    public void desenha(Batch batch) {
        System.out.println(x);
        setX(x);
        setY(y);
        super.draw(batch);
    }

    public float getSpeed() {
        return (int) (speed * Gdx.graphics.getDeltaTime());
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public float getX() {
        return x;
    }

    @Override
    public void setX(float x) {
        this.x = x;
    }

    @Override
    public float getY() {
        return y;
    }

    @Override
    public void setY(float y) {
        this.y = y;
    }
}

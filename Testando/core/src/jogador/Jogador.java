package jogador;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.testegdx.Egion;
import com.badlogic.gdx.Gdx;
import controles.Controle;
import controles.Teclado;

public class Jogador extends Sprite {

    private float speed = 420,
                  x = Egion.SCREEN_WIDTH / 2,
                  y = Egion.SCREEN_HEIGHT / 2;

    public Jogador(Texture tex) {
        super(tex);
        setSize(16, 16);
        setCenterX(x);
        setCenterY(y);
    }

    public void move(Teclado tecla) {
        if (tecla.esqCima()) {
            x -= (int) (getSpeed() * Math.sqrt(2) / 2);
            y += (int) (getSpeed() * Math.sqrt(2) / 2);
        } else if (tecla.esqBaixo()) {
            x -= (int) (getSpeed() * Math.sqrt(2) / 2);
            y -= (int) (getSpeed() * Math.sqrt(2) / 2);
        } else if (tecla.dirBaixo()) {
            x += (int) (getSpeed() * Math.sqrt(2) / 2);
            y -= (int) (getSpeed() * Math.sqrt(2) / 2);
        } else if (tecla.dirCima()) {
            x += (int) (getSpeed() * Math.sqrt(2) / 2);
            y += (int) (getSpeed() * Math.sqrt(2) / 2);
        } else if (tecla.segCima()) {
            y += getSpeed();
        } else if (tecla.segBaixo()) {
            y -= getSpeed();
        } else if (tecla.segEsquerda()) {
            x -= getSpeed();
        } else if (tecla.segDireita()) {
            x += getSpeed();
        }
    }
    @Override
    public void draw(SpriteBatch batch) {
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

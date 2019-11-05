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

    private float speed = 210,
                  pos_x = 0,
                  pos_y = 0,
                  largura = 16,
                  altura = 33;

    public Controle controle;

    public Jogador(Texture tex) {
        super(tex);
        setSize(largura, altura);
        setCenterX((int) largura / 2);
        setCenterY((int) altura / 2);
        controle = new Teclado(Input.Keys.UP, Input.Keys.DOWN, Input.Keys.LEFT, Input.Keys.RIGHT);
    }

    public void move() {
        if (controle.esqCima()) {
            pos_x -= (int) (getSpeed() * Math.sqrt(2) / 2);
            pos_y += (int) (getSpeed() * Math.sqrt(2) / 2);
        } else if (controle.esqBaixo()) {
            pos_x -= (int) (getSpeed() * Math.sqrt(2) / 2);
            pos_y -= (int) (getSpeed() * Math.sqrt(2) / 2);
        } else if (controle.dirBaixo()) {
            pos_x += (int) (getSpeed() * Math.sqrt(2) / 2);
            pos_y -= (int) (getSpeed() * Math.sqrt(2) / 2);
        } else if (controle.dirCima()) {
            pos_x += (int) (getSpeed() * Math.sqrt(2) / 2);
            pos_y += (int) (getSpeed() * Math.sqrt(2) / 2);
        } else if (controle.segCima()) {
            pos_y += getSpeed();
        } else if (controle.segBaixo()) {
            pos_y -= getSpeed();
        } else if (controle.segEsquerda()) {
            pos_x -= getSpeed();
        } else if (controle.segDireita()) {
            pos_x += getSpeed();
        }
    }


    public void desenha(Batch batch) {
        super.setX(pos_x + (int) largura / 2);
        super.setY(pos_y + (int) altura / 2);
        super.draw(batch);
    }

    public float getSpeed() {
        return (int) (speed * Gdx.graphics.getDeltaTime());
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getPos_x() {
        return pos_x;
    }

    public void setPos_x(float x) {
        this.pos_x = x;
    }

    public float getPos_y() {
        return pos_y;
    }

    public void setPos_y(float y) {
        this.pos_y = y;
    }
}

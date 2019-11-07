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

    public final double raiz = Math.sqrt(2) / 2;

    private float speed = 262,
                  pos_x = 340,
                  pos_y = 340,
                  largura = 16,
                  altura = 33;

    public Controle controle;

    public Jogador(Texture tex) {
        super(tex);
        setSize(largura, altura);
        setCenterX((int) largura / 2);
        setCenterY((int) altura / 2);
        controle = new Teclado(Input.Keys.W, Input.Keys.S, Input.Keys.A, Input.Keys.D);
    }

    public void move() {
        double s = getSpeed();
        if (controle.esqCima()) {
            pos_x -= (int) (s * raiz);
            pos_y += (int) (s * raiz);
        } else if (controle.esqBaixo()) {
            pos_x -= (int) (s * raiz);
            pos_y -= (int) (s * raiz);
        } else if (controle.dirBaixo()) {
            pos_x += (int) (s * raiz);
            pos_y -= (int) (s * raiz);
        } else if (controle.dirCima()) {
            pos_x += (int) (s * raiz);
            pos_y += (int) (s * raiz);
        } else if (controle.segCima()) {
            pos_y += s;
        } else if (controle.segBaixo()) {
            pos_y -= s;
        } else if (controle.segEsquerda()) {
            pos_x -= s;
        } else if (controle.segDireita()) {
            pos_x += s;
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

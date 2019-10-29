package Menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Botao {
    private Sprite cur_img; //imagem em uso (current image)
    private Sprite[] imgs;
    public boolean marcado;

    public Botao(float pos_x, float pos_y, float width, float height, Texture img) {
        marcado = false;
        cur_img = new com.badlogic.gdx.graphics.g2d.Sprite(img);
        cur_img.setX(pos_x);
        cur_img.setY(pos_y);
        cur_img.setSize(width, height);
        imgs = new Sprite[] {cur_img,cur_img,cur_img};//no caso do botao nao posuir variacoes
    }

    public Botao(float pos_x, float pos_y, float width, float height, Texture img0, Texture img1, Texture img2) {
        marcado = false;
        imgs = new Sprite[3];
        int i = 0;
        for (Texture img : new Texture[] {img0, img1, img2}) {
            imgs[i] = new com.badlogic.gdx.graphics.g2d.Sprite(img);
            imgs[i].setX(pos_x);
            imgs[i].setY(pos_y);
            imgs[i].setSize(width, height);
            i++;
        }
        cur_img = imgs[0];
    }

    public void draw(SpriteBatch batch) {
        cur_img = marcado?imgs[1]:imgs[0];
        cur_img.draw(batch);
    }

    public boolean mouseEmCima() {
        if (cur_img.getX() < Gdx.input.getX() &&
                cur_img.getX() + cur_img.getWidth() > Gdx.input.getX() &&
                cur_img.getY() + cur_img.getHeight() > Gdx.graphics.getHeight() - Gdx.input.getY() &&
                Gdx.graphics.getHeight() - Gdx.input.getY() > cur_img.getY()){
            return true;
        }
        return false;
    }

    public boolean clicou() {
        if (mouseEmCima() && Gdx.input.isTouched()) {
            cur_img = imgs[2];
            return true;
        }
        return false;
    }

    public Sprite getCur_img() {
        return cur_img;
    }

    public void setCur_img(Sprite cur_img) {
        this.cur_img = cur_img;
    }

    public float getX() {
        return cur_img.getX();
    }

    public void setX(float x) {
        cur_img.setX(x);
        for (int i = 0; i < 3; i++) {
            imgs[i].setX(x);
        }
    }

    public float getY() {
        return cur_img.getY();
    }

    public void setY(float y) {
        cur_img.setX(y);
        for (int i = 0; i < 3; i++) {
            imgs[i].setY(y);
        }
    }
}

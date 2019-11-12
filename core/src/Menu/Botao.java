package Menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Botao {
    private Sprite imagemInativa, imagemAtiva;

    public Sprite getImagemInativa() {
        return imagemInativa;
    }

    public void setImagemInativa(Sprite imagemInativa) {
        this.imagemInativa = imagemInativa;
    }

    public Sprite getImagemAtiva() {
        return imagemAtiva;
    }

    public void setImagemAtiva(Sprite imagemAtiva) {
        this.imagemAtiva = imagemAtiva;
    }

    public Botao(float pos_x, float pos_y, float width, float height, Texture imgIn, Texture imgAt) {
        setImagemInativa(new com.badlogic.gdx.graphics.g2d.Sprite(imgIn));
        setImagemAtiva(new com.badlogic.gdx.graphics.g2d.Sprite(imgAt));
        getImagemInativa().setX(pos_x);
        getImagemAtiva().setX(pos_x);
        getImagemInativa().setY(pos_y);
        getImagemAtiva().setY(pos_y);
        getImagemInativa().setSize(width, height);
        getImagemAtiva().setSize(width, height);
    }

    public void desenhaBotao(SpriteBatch batch) {
        getImagemInativa().draw(batch);
    }

    public boolean verificaMouse(SpriteBatch batch) {
        if (getImagemInativa().getX() < Gdx.input.getX() && getImagemInativa().getX() + getImagemInativa().getWidth() > Gdx.input.getX() && getImagemInativa().getY() + getImagemInativa().getHeight() > Gdx.graphics.getHeight() - Gdx.input.getY() && Gdx.graphics.getHeight() - Gdx.input.getY() > getImagemInativa().getY()) {
            getImagemAtiva().draw(batch);
            return true;
        }
        return false;
    }

    public boolean verificaClick(SpriteBatch batch) {
        if (Gdx.input.isTouched() && verificaMouse(batch)) {
            return true;
        }
        return false;
    }

}
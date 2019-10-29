package controles;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class Teclado extends Controle {

    public Teclado(int cima, int baixo, int esquerda, int direita){
        this.cima = cima;
        this.baixo = baixo;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public boolean segCima() {
        if(Gdx.input.isKeyPressed(cima)){
            return true;
        }

        return false;
    }

    @Override
    public boolean segBaixo() {
        if (Gdx.input.isKeyPressed(baixo)) {
            return true;
        }

        return false;
    }

    @Override
    public boolean segEsquerda() {
        if (Gdx.input.isKeyPressed(esquerda)) {
            return true;
        }

        return false;
    }

    @Override
    public boolean segDireita() {
        if (Gdx.input.isKeyPressed(direita)) {
            return true;
        }

        return false;
    }

    @Override
    public boolean clicCima() {
        if (Gdx.input.isKeyJustPressed(cima)) {
            return true;
        }

        return false;
    }

    @Override
    public boolean clicBaixo() {
        if (Gdx.input.isKeyJustPressed(baixo)) {
            return true;
        }

        return false;
    }

    @Override
    public boolean clicEsquerda() {
        if (Gdx.input.isKeyJustPressed(esquerda)) {
            return true;
        }

        return false;
    }

    @Override
    public boolean clicDireita() {
        if (Gdx.input.isKeyJustPressed(direita)) {
            return true;
        }

        return false;
    }

    @Override
    public boolean esqCima() {
        if (Gdx.input.isKeyPressed(cima) && Gdx.input.isKeyPressed(esquerda)) {
            return true;
        }

        return false;
    }

    @Override
    public boolean esqBaixo() {
        if (Gdx.input.isKeyPressed(baixo) && Gdx.input.isKeyPressed(esquerda)) {
            return true;
        }

        return false;
    }

    @Override
    public boolean dirCima() {
        if (Gdx.input.isKeyPressed(cima) && Gdx.input.isKeyPressed(direita)) {
            return true;
        }

        return false;
    }

    @Override
    public boolean dirBaixo() {
        if (Gdx.input.isKeyPressed(baixo) && Gdx.input.isKeyPressed(direita)) {
            return true;
        }

        return false;
    }
}

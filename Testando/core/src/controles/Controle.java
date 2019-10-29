package controles;

public abstract class Controle {

    protected int cima;
    protected int baixo;
    protected int esquerda;
    protected int direita;

    //'seg' = segurarando o botao
    public abstract boolean segCima();
    public abstract boolean segBaixo();
    public abstract boolean segEsquerda();
    public abstract boolean segDireita();
    //diagonais
    public abstract boolean esqCima();
    public abstract boolean esqBaixo();
    public abstract boolean dirCima();
    public abstract boolean dirBaixo();

    //'clic' = clicou o botao
    public abstract boolean clicCima();
    public abstract boolean clicBaixo();
    public abstract boolean clicEsquerda();
    public abstract boolean clicDireita();

    public int getCima() {
        return cima;
    }

    public void setCima(int cima) {
        this.cima = cima;
    }

    public int getBaixo() {
        return baixo;
    }

    public void setBaixo(int baixo) {
        this.baixo = baixo;
    }

    public int getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(int esquerda) {
        this.esquerda = esquerda;
    }

    public int getDireita() {
        return direita;
    }

    public void setDireita(int direita) {
        this.direita = direita;
    }
}


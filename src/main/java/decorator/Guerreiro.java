package decorator;

public class Guerreiro implements Campeao {
    private int poderAtaque;

    public Guerreiro(int poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    @Override
    public int getPoderAtaque() {
        return poderAtaque;
    }
}
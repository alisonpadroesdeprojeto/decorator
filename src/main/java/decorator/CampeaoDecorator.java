package decorator;

public abstract class CampeaoDecorator implements Campeao {
    protected Campeao campeao;

    public CampeaoDecorator(Campeao campeao) {
        this.campeao = campeao;
    }

    public abstract int getPoderAdicional();

    @Override
    public int getPoderAtaque() {
        return this.campeao.getPoderAtaque() + this.getPoderAdicional();
    }
}

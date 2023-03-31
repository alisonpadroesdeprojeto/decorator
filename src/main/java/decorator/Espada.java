package decorator;

public class Espada extends CampeaoDecorator {
    public Espada(Campeao notaFiscal) {
        super(notaFiscal);
    }

    @Override
    public int getPoderAdicional() {
        return 10;
    }
}

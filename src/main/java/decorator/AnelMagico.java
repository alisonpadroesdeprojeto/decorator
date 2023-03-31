package decorator;

public class AnelMagico extends CampeaoDecorator {
    public AnelMagico(Campeao notaFiscal) {
        super(notaFiscal);
    }

    public int getPoderAdicional() {
        return 5;
    }
}

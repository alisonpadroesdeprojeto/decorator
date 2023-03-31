package decorator;

import org.junit.Test;

import static org.junit.Assert.*;


public class CampeaoTest {
    @Test
    public void deveRetornarPoderDeAtaGuerreiraComAnelMagico() {
        Campeao campeao = new AnelMagico(new Guerreiro(30));
        assertEquals(35, campeao.getPoderAtaque());
    }

    @Test
    public void deveRetornarPoderDeAtaGuerreiraComEspada() {
        Campeao campeao = new Espada(new Guerreiro(30));
        assertEquals(40, campeao.getPoderAtaque());
    }

    @Test
    public void deveRetornarPoderDeAtaGuerreiraComAnelMagicoMaisEspada() {
        Campeao campeao = new AnelMagico(new Espada(new Guerreiro(30)));
        assertEquals(45, campeao.getPoderAtaque());
    }
}
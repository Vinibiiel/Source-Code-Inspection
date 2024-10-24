package test.java;

import main.java.br.calebe.core.PapelMoeda;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PapelMoedaTest {

    @Test
    public void TesteCriacaoPapelMoeda() {
        PapelMoeda papelMoeda = new PapelMoeda(10, 1);
        assertNotNull(papelMoeda, "A instancia deve ser criada com valores inteiros");
    }

    @Test
    public void TesteCriacaoPapelMoedaGetValor() {
        PapelMoeda papelMoeda = new PapelMoeda(50, 10);
        assertEquals(50, papelMoeda.getValor(), "O valor deve ser 50");
    }

    @Test
    public void TesteCriacaoPapelMoedaGetQuantidade() {
        PapelMoeda papelMoeda = new PapelMoeda(2, 5);
        assertEquals(10, papelMoeda.getQuantidade(), "A quantidade deve ser 5");
    }

    @Test
    public void TesteCriacaoPapelMoedaValorNegativo() {
        PapelMoeda papelMoeda = new PapelMoeda(-1, -1);
        assertNotNull(papelMoeda, "A instancia deve ser criada mesmo com valores negativos");
    }

    @Test
    public void TestePapelMoedaValorNegativoGetValor() {
        PapelMoeda papelMoeda = new PapelMoeda(-1, -1);
        assertEquals(-1, papelMoeda.getValor(), "O valor deve ser -1");
    }

    @Test
    public void TestePapelMoedaValorNegativoGetQuantidades() {
        PapelMoeda papelMoeda = new PapelMoeda(-1, -1);
        assertEquals(-1, papelMoeda.getQuantidade(), "A quantidade deve ser -1");
    }

}

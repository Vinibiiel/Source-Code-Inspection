package test.java;

import main.java.br.calebe.core.Troco;
import main.java.br.calebe.core.PapelMoeda;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Iterator;

public class TestTroco {

    @Test
    public void TesteCriacaoTroco() {
        Troco troco = new Troco(5);
        assertNotNull(troco, "A instancia deve ser criada com valor inteiro");
    }

    @Test
    public void TesteCriacaoTrocoGetTrocoIterator() {
        Troco troco = new Troco(5);
        assertTrue(troco.getIterator() instanceof Iterator<PapelMoeda> , "O troco deve ser do tipo PapelMoeda");
    }

}

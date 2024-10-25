package test.java;

import main.java.br.calebe.core.TicketMachine;
import main.java.br.calebe.exception.PapelMoedaInvalidaException;
import main.java.br.calebe.exception.SaldoInsuficienteException;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

public class TestTicketMachine {

    @Test
    public void TesteCriacaoTicketMachine() {
        TicketMachine ticketMachine = new TicketMachine(5);
        assertNotNull(ticketMachine, "A instancia deve ser criada com valor inteiro");
    }

    @Test
    public void TesteCriacaoTicketMachineGetSaldo() {
        TicketMachine ticketMachine = new TicketMachine(5);
        assertEquals(0, ticketMachine.getSaldo(), "O saldo deve ser 0"); // Já que eu não inseri nada
    }

    @Test
    public void TesteCriacaoTicketMachineInserirGetSaldo() {
        TicketMachine ticketMachine = new TicketMachine(5);
        ticketMachine.inserir(10);
        assertEquals(10, ticketMachine.getSaldo(), "O saldo deve ser 10");
    }

    @Test
    public void TesteCriacaoTicketMachineInserirPapelMoedaInvalido() {
        TicketMachine ticketMachine = new TicketMachine(5);
        assertThrows(PapelMoedaInvalidaException.class, () -> ticketMachine.inserir(13));
    }

    @Test
    public void TesteCriacaoTicketMachineGettroco() {
        TicketMachine ticketMachine = new TicketMachine(5);
        assertTrue(ticketMachine.getTroco() instanceof Iterator<Integer> , "O troco deve ser do tipo Iterator");
    }

    @Test
    public void TesteTicketMachineImprimir() {
        TicketMachine ticketMachine = new TicketMachine(5);
        ticketMachine.inserir(5);
        String result = "*****************\n";
        result += "*** R$ " + ticketMachine.getSaldo() + ",00 ****\n";
        result += "*****************\n";
        assertEquals(result, ticketMachine.imprimir(), "A mensagem de impressão deve ser a mesma");
    }

    @Test
    public void TesteTicketMachineImprimirSaldoNegativo() {
        TicketMachine ticketMachine = new TicketMachine(5);
        assertThrows(SaldoInsuficienteException.class, () -> ticketMachine.imprimir());
    }
}

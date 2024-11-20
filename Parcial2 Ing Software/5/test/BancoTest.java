
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pkg5.Banco;
import pkg5.Cuenta;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karen
 */
public class BancoTest {
    private static Banco banco;

    @BeforeAll
    public static void setUp() {
        banco = new Banco();
        banco.agregarCuenta(new Cuenta("0310", 1000));
        banco.agregarCuenta(new Cuenta("1013", 2000));
    }

    @Test
    public void existeCuenta() {
        assertTrue(banco.existeCuenta("0310"));
    }

    @Test
    public void existeCuentaFallido() {
        assertFalse(banco.existeCuenta("123"));
    }

    @Test
    public void depositarTest() {
        Cuenta cuenta = new Cuenta("0310", 500);
        cuenta.depositar(200);
        assertEquals(700, cuenta.getSaldo());
    }

    @Test
    public void retirarTest() {
        Cuenta cuenta = new Cuenta("0310", 500);
        cuenta.retirar(300);
        assertEquals(200, cuenta.getSaldo());
    }

    @Test
    public void depositarTestFallido() {
        Cuenta cuenta = new Cuenta("123", 500);
        assertThrows(IllegalArgumentException.class, () -> cuenta.depositar(-100));
    }

    @Test
    public void retirarTestFallido() {
        Cuenta cuenta = new Cuenta("1013", 50000);
        assertThrows(IllegalArgumentException.class, () -> cuenta.retirar(1000));
    }
}

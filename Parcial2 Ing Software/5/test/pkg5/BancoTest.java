/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pkg5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author karen
 */
public class BancoTest {
    private static Banco banco;

    @BeforeAll
    public static void setUp() {
        banco = new Banco();
        banco.agregarCuenta(new Cuenta("123", 1000));
        banco.agregarCuenta(new Cuenta("456", 2000));
    }

    @Test
    public void testExisteCuenta() {
        assertTrue(banco.existeCuenta("123"));
    }

    @Test
    public void testExisteCuentaFallido() {
        assertFalse(banco.existeCuenta("999"));
    }

    @Test
    public void testDepositar() {
        Cuenta cuenta = new Cuenta("789", 500);
        cuenta.depositar(200);
        assertEquals(700, cuenta.getSaldo());
    }

    @Test
    public void testRetirar() {
        Cuenta cuenta = new Cuenta("789", 500);
        cuenta.retirar(300);
        assertEquals(200, cuenta.getSaldo());
    }

    @Test
    public void testDepositarFallido() {
        Cuenta cuenta = new Cuenta("789", 500);
        assertThrows(IllegalArgumentException.class, () -> cuenta.depositar(-100));
    }

    @Test
    public void testRetirarFallido() {
        Cuenta cuenta = new Cuenta("789", 500);
        assertThrows(IllegalArgumentException.class, () -> cuenta.retirar(1000));
    }
    
}

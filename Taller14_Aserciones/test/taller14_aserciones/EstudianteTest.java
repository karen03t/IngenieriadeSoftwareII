/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package taller14_aserciones;

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
public class EstudianteTest {
    
    public EstudianteTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of agregarCalificacion method, of class Estudiante.
     */
    @Test
    public void testAgregarCalificacion() {
        System.out.println("agregarCalificacion");
        double calificacion = 0.0;
        Estudiante instance = null;
        instance.agregarCalificacion(calificacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerPromedio method, of class Estudiante.
     */
    @Test
    public void testObtenerPromedio() {
        System.out.println("obtenerPromedio");
        Estudiante instance = null;
        double expResult = 0.0;
        double result = instance.obtenerPromedio();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Estudiante.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Estudiante instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEdad method, of class Estudiante.
     */
    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Estudiante instance = null;
        int expResult = 0;
        int result = instance.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroCalificaciones method, of class Estudiante.
     */
    @Test
    public void testGetNumeroCalificaciones() {
        System.out.println("getNumeroCalificaciones");
        Estudiante instance = null;
        int expResult = 0;
        int result = instance.getNumeroCalificaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

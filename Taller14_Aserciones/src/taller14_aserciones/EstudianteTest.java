package taller14_aserciones;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
/**
 *
 * @author karen
 */
public class EstudianteTest {
    static Estudiante estudiante;
    
    @BeforeAll
    static void setup(){
        estudiante = new Estudiante("karen", 21);
    }
    
    @AfterAll
    static void cleanup() {
        // Este método se ejecuta después de todas las pruebas
        System.out.println("Limpieza después de todas las pruebas.");
    }
    
    @Test
    void agregarCalificacionTest() {
        estudiante.agregarCalificacion(90.0);

        // Verificar que el número de calificaciones es 1
        assertEquals(1, estudiante.getNumeroCalificaciones());
    }
    
    @Test
    void obtenerPromedioTest() {
        // Agregar calificaciones
        estudiante.agregarCalificacion(80.0);
        estudiante.agregarCalificacion(100.0);

        // Verificar que el promedio sea 90.0
        assertEquals(90.0, estudiante.obtenerPromedio());
    }
    @Test
    void getNumeroCalificacionesTest() {
        // Verificar que el número de calificaciones es 2
        assertEquals(2, estudiante.getNumeroCalificaciones());
    }
    
    @Test
void agregarCalificacionExceptionTest() {
    // Verificar que se lanza IllegalArgumentException al agregar una calificación fuera de rango
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        estudiante.agregarCalificacion(-10.0);
    });
    // Verificar que el mensaje de la excepción es el esperado
    assertEquals("La calificación debe estar entre 0 y 10", exception.getMessage());
}

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication30;

import java.util.List;

/**
 *
 * @author karen
 */
public class JavaApplication30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Libreria libreria = new Libreria ();
        
        
        libreria.agregarLibro(new Libro("El Quijote", "Cervantes", 20.0, 1605));
        libreria.agregarLibro(new Libro("1984", "Orwell", 15.0, 1949));
        libreria.agregarLibro(new Libro("Ficciones", "Borges", 25.0, 1944));

        System.out.println("Buscar libro por título:");
        Libro libro = libreria.buscarPorTitulo("1984");
        System.out.println(libro != null ? libro : "Libro no encontrado.");

        System.out.println("\\nBuscar libros por autor:");
        List<Libro> librosPorAutor = libreria.buscarPorAutor("Borges");
        librosPorAutor.forEach(System.out::println);

        System.out.println("\\nLibros en rango de precios (15.0 a 30.0):");
        List<Libro> librosPorPrecio = libreria.obtenerPorRangoDePrecio(15.0, 30.0);
        librosPorPrecio.forEach(System.out::println);
    }
 }
    


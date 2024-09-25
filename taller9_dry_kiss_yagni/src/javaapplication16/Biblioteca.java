/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karen
 */
public class Biblioteca {
    private List<Libro> libros = new ArrayList<>();

   
    public void agregarLibro(Libro libro) {
        libro.setAñoPublicacion(2024);  
        libros.add(libro); 
    }
    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}

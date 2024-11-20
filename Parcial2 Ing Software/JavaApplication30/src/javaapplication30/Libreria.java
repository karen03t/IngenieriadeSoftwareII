
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karen
 */
import javaapplication30.Libro;
public class Libreria {
    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro buscarPorTitulo(String titulo) {
        return libros.stream()
                     .filter(libro -> libro.getTitulo().equalsIgnoreCase(titulo))
                     .findFirst()
                     .orElse(null);
    }

    public List<Libro> buscarPorAutor(String autor) {
        return libros.stream()
                     .filter(libro -> libro.getAutor().equalsIgnoreCase(autor))
                     .collect(Collectors.toList());
    }

    public List<Libro> obtenerPorRangoDePrecio(double minPrecio, double maxPrecio) {
        return libros.stream()
                     .filter(libro -> libro.getPrecio() >= minPrecio && libro.getPrecio() <= maxPrecio)
                     .collect(Collectors.toList());
    }

    public List<Libro> obtenerPorAño(int año) {
        return libros.stream()
                     .filter(libro -> libro.getAño()== año)
                     .collect(Collectors.toList());
    }
}


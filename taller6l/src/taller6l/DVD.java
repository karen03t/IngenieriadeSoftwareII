/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6l;

/**
 *
 * @author karen
 */
public class DVD implements LibreriaDVD{
    String nombre;
    String archivo; 
    int stock;

    public DVD(String nombre, String archivo, int stock) {
        this.nombre = nombre;
        this.archivo = archivo;
        this.stock = stock;
    }
    
    @Override
    public void prestar() {
        if (stock > 0) {
            stock--;
            System.out.println("El DVD '" + nombre + "' ha sido prestado. Stock restante: " + stock);
        } else {
            System.out.println("No hay stock disponible para el DVD '" + nombre + "'.");
        }
    }

    @Override
    public void devolver() {
        stock++;
        System.out.println("El DVD '" + nombre + "' ha sido devuelto. Stock actual: " + stock);
    }
}

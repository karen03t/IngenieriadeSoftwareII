/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6l;

/**
 *
 * @author karen
 */
public class Cartilla implements LibreriaCartilla{
    String nombre; 
    int numeroHojas;

    public Cartilla(String nombre, int numeroHojas) {
        this.nombre = nombre;
        this.numeroHojas = numeroHojas;
    }

    @Override
    public void prestar() {
        System.out.println("La cartilla '" + nombre + "' ha sido prestada.");
    }

    @Override
    public void devolver() {
         System.out.println("La cartilla '" + nombre + "' ha sido devuelta.");
    }

    @Override
    public void mantenimetoHojas() {
       System.out.println("Se ha realizado el mantenimiento de la cartilla '" + nombre + "'. Número de hojas: " + numeroHojas);
    }
   }

    
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller6l;

/**
 *
 * @author karen
 */
public class Taller6l {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro libro1 = new Libro("alicia en el pais de las maraviillas", 150,"imagen","aaa--1");
        Libro libro2 = new Libro("Cumbres Borrascosas ",260,"portada","bbb-11" );
        Libro libro3 = new Libro("after", 360,"portadaa","ccc--2");
        
        Cartilla cartilla1 = new Cartilla("nacho",50);
        Cartilla cartilla2 = new Cartilla("ingles ",100);
        Cartilla cartilla3 = new Cartilla("batematicas basicas ",520);
        
        DVD DVD1 = new DVD("rey leon","reyLeon.mp4",10);
        DVD DVD2 = new DVD("mulan", "mulan-mp4",25);
        DVD DVD3 = new DVD("cenicienta","cenicienta.mp4",15);
        
        libro1.prestar();
        libro1.renovacionDePortada();
        libro1.mantenimientoDeHojas();
        libro1.solicitarNuevaVersion();
        libro1.devolver();
        
        libro2.prestar();
        libro2.renovacionDePortada();
        libro2.mantenimientoDeHojas();
        libro2.solicitarNuevaVersion();
        libro2.devolver();
        
        libro3.prestar();
        libro3.renovacionDePortada();
        libro3.mantenimientoDeHojas();
        libro3.solicitarNuevaVersion();
        libro3.devolver();
       
        cartilla1.prestar();
        cartilla1.mantenimetoHojas();
        cartilla1.devolver();
        
        cartilla2.prestar();
        cartilla2.mantenimetoHojas();
        cartilla2.devolver();
        
        cartilla3.prestar();
        cartilla3.mantenimetoHojas();
        cartilla3.devolver();
        
     
        DVD1.prestar();
        DVD1.devolver();
        
        DVD2.prestar();
        DVD2.devolver();
        
        DVD3.prestar();
        DVD3.devolver();
        
    }
    
}

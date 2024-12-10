/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1patronprototype;

/**
 *
 * @author juanm
 */
public class Ejemplo1PatronPrototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro ("TITULO1", "AUTOR1");
        Libro libro2 = (Libro) libro1.clone();
        System.out.println(libro1.toString());
        libro2.setTitulo("TITULO2");
        System.out.println(libro2.toString());
    }
    
}

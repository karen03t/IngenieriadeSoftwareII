/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1_patron_builder;

/**
 *
 * @author juanm
 */
public class Ejemplo1_Patron_Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Builder builder = new Builder().setMasa("Masa");
        Pizza pizza = builder.build();
        System.out.println(pizza.toString());
    }
    
}

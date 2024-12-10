/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2patronadapter;

/**
 *
 * @author juanm
 */
public class Ejemplo2PatronAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SistemaPagoExterno sistemaPagoExterno = new SistemaPagoExterno();
        SistemaDePago sistemaDePago = new AdaptadorSistemaPagoExterno(sistemaPagoExterno);
        sistemaDePago.procesarPago();
    }
    
}

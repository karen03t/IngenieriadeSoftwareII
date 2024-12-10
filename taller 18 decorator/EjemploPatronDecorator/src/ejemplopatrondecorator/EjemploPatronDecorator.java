/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopatrondecorator;

/**
 *
 * @author juanm
 */
public class EjemploPatronDecorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bebida bebida = new Cafe();
        Bebida capuchino = new Capuchino(bebida);
        System.out.println(capuchino.costo());
    }
    
}

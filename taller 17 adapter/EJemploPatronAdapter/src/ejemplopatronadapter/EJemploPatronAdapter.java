/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopatronadapter;

/**
 *
 * @author juanm
 */
public class EJemploPatronAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CocheNuevo cocheNuevo = new CocheNuevo();
        Vehiculo vehiculo = new AdapterCocheNuevo(cocheNuevo);
        vehiculo.acelerar();
        vehiculo.frenar();
    }
    
}

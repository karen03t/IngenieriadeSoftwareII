/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejmplo15factorymethod;

/**
 *
 * @author karen
 */
public class Ejmplo15factorymethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Creadora creadora = new CreadoraEnvioRegular();
        ServicioEnvio envioExpress = creadora.crearServicioEnvio();
        envioExpress.enviar("paquete");
        
        
        
        
        
    }
    
}

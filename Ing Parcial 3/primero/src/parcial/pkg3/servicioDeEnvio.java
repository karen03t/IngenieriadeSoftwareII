/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package parcial.pkg3;

/**
 *
 * @author hp
 */
public interface servicioDeEnvio {
    public abstract paquete contenidoPaquete(String mensaje) ;
    public abstract Envio envioPaquete(String mensaje );
}

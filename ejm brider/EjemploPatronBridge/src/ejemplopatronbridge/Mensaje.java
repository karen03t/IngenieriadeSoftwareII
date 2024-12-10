/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatronbridge;

/**
 *
 * @author juanm
 */
public abstract class Mensaje {
    PlataformaMensaje plataformaMensaje;
    
    public Mensaje(PlataformaMensaje plataformaMensaje){
        this.plataformaMensaje = plataformaMensaje;
    }
    
    public abstract void enviarMensaje(String mensaje);
}

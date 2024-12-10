/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatronbridge;

/**
 *
 * @author juanm
 */
public class MensajeUrgente extends Mensaje {
    
    public MensajeUrgente(PlataformaMensaje plataformaMensaje){
        super(plataformaMensaje);
    }
    //Metodos adicionales
    
    @Override 
    public void enviarMensaje(String mensaje){
        //Logica Adicional
        //Metodos Adicionales
        plataformaMensaje.enviarMensaje(mensaje);
    }
}

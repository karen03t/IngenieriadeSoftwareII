/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopatronbridge;

/**
 *
 * @author juanm
 */
public class EjemploPatronBridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CorreoElectronico correo;
        CorreoElectronico PlataformaMensaje = correo = new CorreoElectronico();
        Mensaje mensajeUrgente = new MensajeUrgente(correo);
        mensajeUrgente.enviarMensaje("Hola mundo");
    }
    
}

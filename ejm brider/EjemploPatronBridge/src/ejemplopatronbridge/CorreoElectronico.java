/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatronbridge;

/**
 *
 * @author juanm
 */
public class CorreoElectronico implements PlataformaMensaje{

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("ENVIANDO MENSAJE POR CORREO ELECTRONICO");
    }
    
}

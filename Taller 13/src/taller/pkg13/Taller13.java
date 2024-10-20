/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg13;

/**
 *
 * @author karen
 */
public class Taller13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}}
        Notificacion notificacion = new Notificacion("holas", "esto es una descripcion ");
        
        Notificador notificador = new Notificador(new CanalCorreoElectronico());
        notificador.notificar(notificacion);

        // Cambiar a envío por SMS
        notificador.setCanal(new CanalMensajeTexto());
        notificador.notificar(notificacion);

        // Cambiar a envío por WhatsApp
        notificador.setCanal(new CanalWhatsapp());
        notificador.notificar(notificacion);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto2;

/**
 *
 * @author karen
 */
public class enviarNotificacionesPorWhatsaap implements ServicioNotificaciones{

    @Override
    public String envioDeMensaje(String medio) {
       String mensaje ="enviando notificacion por whatsaap";
       return notificacion+mensaje;
    }


}

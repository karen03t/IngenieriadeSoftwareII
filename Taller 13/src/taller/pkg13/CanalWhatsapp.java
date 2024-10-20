/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg13;

/**
 *
 * @author karen
 */
public class CanalWhatsapp implements CanalNotificaciom{

    @Override
    public void enviar(Notificacion notificacion) {
        System.out.println("envinad a Whatsapp : "+ notificacion.getTitulo()+notificacion.getCuerpo());
    }
    
}

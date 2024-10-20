/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg13;

/**
 *
 * @author karen
 */
public class Notificador {
    private CanalNotificaciom canal;

    public Notificador(CanalNotificaciom canal) {
        this.canal = canal;
    }

    public void notificar(Notificacion notificacion) {
        canal.enviar(notificacion);
    }

    public void setCanal(CanalNotificaciom canal) {
        this.canal = canal;
    }
}

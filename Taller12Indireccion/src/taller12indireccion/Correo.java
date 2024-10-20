/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12indireccion;

/**
 *
 * @author karen
 */
public class Correo {
    private String servicio;
    private String nombreUsuario;
    private String idUsuario;

    public Correo(String servicio, String nombreUsuario, String idUsuario) {
        this.servicio = servicio;
        this.nombreUsuario = nombreUsuario;
        this.idUsuario = idUsuario;
    }

    public String getServicio() {
        return servicio;
    }
}

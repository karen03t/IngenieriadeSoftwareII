/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12indireccion;

/**
 *
 * @author karen
 */
public class Usuario {
    private String nombre;
    private String identificacion;
    private ServicioNotificacion servicioNotificacion;

    public Usuario(String nombre, String identificacion, ServicioNotificacion servicioNotificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.servicioNotificacion = servicioNotificacion;
    }

    

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void generarCorreo() {
        Correo correo = servicioNotificacion.crear(this);
        System.out.println("Correo generado con el servicio: " + correo.getServicio());
    }
}

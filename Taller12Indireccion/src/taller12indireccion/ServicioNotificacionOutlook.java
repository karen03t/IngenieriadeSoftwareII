/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12indireccion;

/**
 *
 * @author karen
 */
public class ServicioNotificacionOutlook implements ServicioNotificacion{

    @Override
    public Correo crear(Usuario usuario) {
        return new Correo("outlook ", usuario.getNombre(), usuario.getIdentificacion());
    }

    

   
}

package taller12indireccion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karen
 */
public class ServicioNotificiacionGmail  implements ServicioNotificacion{

    @Override
    public Correo crear(Usuario usuario) {
        return new Correo("gmail", usuario.getNombre(), usuario.getIdentificacion());
    }

    
}
    


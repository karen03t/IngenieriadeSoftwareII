/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller12indireccion;

/**
 *
 * @author karen
 */
public class Taller12Indireccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioNotificacion servicioGmail = new ServicioNotificiacionGmail();
        Usuario usuario = new Usuario("Karencita", "123", servicioGmail);
        usuario.generarCorreo();
        
        ServicioNotificacion servicioOutlook = new ServicioNotificacionOutlook();
        Usuario usuario2 = new Usuario("Karencita2", "12345", servicioOutlook);
        usuario2.generarCorreo();
        
        
        
        
    }
    
    
}

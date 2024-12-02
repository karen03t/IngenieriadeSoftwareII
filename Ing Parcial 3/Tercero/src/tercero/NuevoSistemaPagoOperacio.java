/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tercero;

/**
 *
 * @author hp
 */
public class NuevoSistemaPagoOperacio {
    public void crearSesion(NuevoSistemaPago nuevoSistemaPago){
        System.out.println("Creando la Sesion a "+ nuevoSistemaPago.getNombre());
    }
    
    public void validarCorreo (NuevoSistemaPago nuevoSistemaPago){
        System.out.println("validando el correo: "+ nuevoSistemaPago.getCorreo());
    }
    public void validarAutorizacion(){
        System.out.println("validando autorizacion");
      
    }
    public void realizarPago(){
        System.out.println("realizando el pago ");
    }
}

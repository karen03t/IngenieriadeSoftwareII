/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talle2_Refactorizado;

/**
 *
 * @author karen
 */
public class EnvioDeCorreo {
    public void enviarEmailFactura(Factura factura){
        System.out.println("-Hola Esta Es la Factura de tu Compra-");
        System.out.println("numero de Factura: "+ factura.getNumeroFactura());
        System.out.println("- "+ factura.getCliente().getNombre());
        System.out.println("Nit de la empresa : "+ factura.getNit());
        System.out.println("Nuestro telefono: "+factura.getTelefono());
        System.out.println("Esatmos Ubicados en: " + factura.getDireccion());
        System.out.println("Fecha de impresion: "+ factura.getFechaImpresion());
        System.out.println("Medio de Pago: "+ factura.getMedioDePago());
        
        
    }
}

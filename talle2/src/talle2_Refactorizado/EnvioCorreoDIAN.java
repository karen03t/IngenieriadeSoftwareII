/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talle2_Refactorizado;

/**
 *
 * @author karen
 */
public class EnvioCorreoDIAN {
    
    public void enviarInformacionFactura(Factura factura) {
        Cliente cliente = factura.getCliente();
       
        System.out.println("Enviando información a la DIAN");
        System.out.println("Detalles de la Factura:");
        System.out.println("Número de Factura: " + factura.getNumeroFactura());
        System.out.println("NIT: " + factura.getNit());
        System.out.println("Teléfono: " + factura.getTelefono());
        System.out.println("Dirección: " + factura.getDireccion());
        System.out.println("Fecha de Impresión: " + factura.getFechaImpresion());
        System.out.println("Medio de Pago: " + factura.getMedioDePago());
        
        System.out.println("\nDetalles del Cliente:");
        System.out.println("Nombre del Cliente: " + cliente.getNombre());
        System.out.println("Cedula del Cliente: "+cliente.getCedula());
        System.out.println("Correo del Cliente: "+cliente.getCorreo());
        System.out.println("Direccion del Cliente: "+cliente.getDireccion());
       
    }

}

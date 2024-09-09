/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2_sinsrp;
import java.util.Date;
import taller2_sinsrp.Cliente;
import taller2_sinsrp.Factura;
/**
 *
 * @author karen
 */
public class Taller2_sinSRP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente1 = new Cliente("karen tatiana orrego", "karent.orregob@autonoma.edu.co.com", "Calle 123", "3208181448");
        Cliente cliente2 = new Cliente("danilo jimenez", "dani1325a@gemail.com", "Avenida 742", "3173171181");

     
        cliente1.guardarCliente();
        cliente2.guardarCliente();

        Factura factura1 = new Factura("NIT001", "555-1234", "Avenida Falsa 123", new Date(2024, 7, 10), "Efectivo", cliente1);
        Factura factura2 = new Factura("NIT002", "555-1234", "Avenida Falsa 123", new Date(2024, 7, 15), "Tarjeta", cliente2);
        
        factura1.guardarFactura(cliente1, "NIT001", "555-1234", "Avenida Falsa 123", new Date(2024, 7, 15), "Tarjeta");
        factura2.guardarFactura(cliente2, "NIT002", "555-1234", "Avenida Falsa 123", new Date(2024, 7, 15), "Efectivo");
       
        factura1.enviarEmailFactura(factura1);
        factura1.enviarEmailFactura(factura2);
        
        Factura factura = new Factura("","","", new Date(),"", null);
        factura.generarReporteFacturas(7, 2024);
        
        factura1.enviarInformacionFactura(factura1);
        factura2.enviarInformacionFactura(factura2);
        
    }
}

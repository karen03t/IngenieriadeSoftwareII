/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package talle2_Refactorizado;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author karen
 */
public class Talle2 {

    
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("karen tatiana orrego", "karent.orregob@autonoma.edu.co.com", "Calle 123", "3208181448");
        Cliente cliente2 = new Cliente("danilo jimenez", "dani1325a@gemail.com", "Avenida 742", "3173171181");
        
        cliente1.guardarCliente();
        cliente2.guardarCliente();
        
        List<Cliente>cliente = Cliente.getDatosCliente();
        
        Factura factura1 = new Factura("NIT001", "555-1234", "Avenida Falsa 123", new Date(2024, 7, 10), "Efectivo", cliente1);
        Factura factura2 = new Factura("NIT002", "555-1234", "Avenida Falsa 123", new Date(2024, 7, 15), "Tarjeta", cliente2);
        
        factura1.guardarFactura(cliente1, "NIT001", "555-1234", "Avenida Falsa 123", new Date(2024, 7, 15), "Tarjeta");
        factura2.guardarFactura(cliente2, "NIT002", "555-1234", "Avenida Falsa 123", new Date(2024, 7, 15), "Efectivo");
        
       EnvioDeCorreo envioDeCorreo = new EnvioDeCorreo();
       EnvioCorreoDIAN envioCorreoDIAN = new EnvioCorreoDIAN();
       ReporteFactura reporteFactura = new  ReporteFactura();
       
       envioDeCorreo.enviarEmailFactura(factura1);
       envioDeCorreo.enviarEmailFactura(factura2);
        
       envioCorreoDIAN.enviarInformacionFactura(factura1);
       envioCorreoDIAN.enviarInformacionFactura(factura2);
       
       List<Factura> listaFacturas = Factura.getListaFacturas();
       Scanner scanner = new Scanner (System.in);
        System.out.println("ingrese el mes (en numero): ");
        int mes = scanner.nextInt()-1;
        System.out.println("ingrese el año: ");
        int año= scanner.nextInt();
        reporteFactura.generarReporteFacturas(listaFacturas, mes, año);
        
        scanner.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

import java.util.Date;
import java.util.List;

/**
 *
 * @author karen
 */
public class Factura {
    private Cliente cliente;
    private List<Producto> productos;
    private double descuento;
    private double total;
    private Date fechaFactura;

    public Factura(Cliente cliente, List<Producto> productos) {
        this.cliente = cliente;
        this.productos = productos;
        this.fechaFactura = new Date();
    }

    public double calcularTotal() {
        for (Producto producto : productos) {
            total += producto.getPrecioProducto();
        }
        
        return total;
    }

    public double calcularPrecioConDescuento(double descuento) {
        this.descuento = descuento;
        return calcularTotal() - descuento;
    }

     public String generarNumeroFactura() {
      
        return "factura numero  :" + cliente.getIdCliente() + "-" + fechaFactura.getTime();
    }
}

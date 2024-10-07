/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author karen
 */
public class ImpDAO extends DAO{
 
    public void guardarProducto(Producto producto) {
        System.out.println("producto guardado");
    }


    public void guardarCliente(Cliente cliente) {
      System.out.println("cliebte guardado");
    }

    public void guardarFactura(Factura factura) {
      System.out.println("factura guardado");
    }
}

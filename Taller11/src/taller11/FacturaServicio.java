/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author karen
 */
public class FacturaServicio {
    private BaseDeDatos baseDeDatos;

    public FacturaService(BaseDeDatos baseDeDatos) {
        this.baseDeDatos = baseDeDatos;
    }

    public void procesarFactura(Cliente cliente, List<Producto> productos) {
  //Logica para procesar unaa facruira
        baseDeDatos.guardarCliente(cliente);

        System.out.println("Facrturaa procesada");
    }
}

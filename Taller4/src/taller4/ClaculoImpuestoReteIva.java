/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4;

/**
 *
 * @author karen
 */
public class ClaculoImpuestoReteIva extends Calculo{

    public ClaculoImpuestoReteIva(String producto, int cantidad, Double precio) {
        super(producto, cantidad, precio);
    }

    
    @Override
    public double calcularImpuesto() {
       return (this.getCantidad()*this.getPrecio() + (this.getCantidad() * this.getPrecio())*0.5);
    }
    
}

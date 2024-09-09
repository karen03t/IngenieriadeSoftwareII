/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4;

/**
 *
 * @author karen
 */
public class CaculoImpuestoSaludable extends Calculo{

    public CaculoImpuestoSaludable(String producto,int cantidad, double precio) {
        super(producto, cantidad , precio);
    }
    @Override
    public double calcularImpuesto(){
        return (this.getCantidad()*this.getPrecio() + (this.getCantidad() * this.getPrecio())*0.19);
    }
}

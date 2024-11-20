/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication30;

/**
 *
 * @author karen
 */
public class Orden {
    private double precio;
    private double descuento; 

    public Orden(double precio, double descuento) {
        this.precio = precio;
        this.descuento = descuento;
    }
    public double calcularTotalImpuesto(double precio){
        double impuesto = precio *0.1;
        return precio+ impuesto;
    }
    
    public double calcularDescuentoTotal(double precio,double descuento){
        double descuentoPrecio = precio - descuento;
        double impuesto = calcularTotalImpuesto(precio);
        return descuento+ impuesto;
        
    }
    
    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the descuento
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    
    
}

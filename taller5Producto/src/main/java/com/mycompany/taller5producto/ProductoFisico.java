/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller5producto;

/**
 *
 * @author karen
 */
public class ProductoFisico extends Producto implements Enviar{
    private double peso;

    public ProductoFisico(double peso, String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
        this.peso = peso;
    }

    @Override
    public double CalcularCostoTotal() {
        return this.getPrecio()*this.getCantidad()+(getPeso()*0.10);
    }
     @Override
    public void enviarPorCorreo() {
         System.out.println("Enviando producto fisico");
    }
    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

   
    
    
    
}

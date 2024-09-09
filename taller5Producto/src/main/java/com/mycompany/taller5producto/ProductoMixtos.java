/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller5producto;

/**
 *
 * @author karen
 */
public class ProductoMixtos extends Producto implements Enviar{
    double peso;
    double tamañoArchivo;

    public ProductoMixtos(double peso, double tamañoArchivo, String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
        this.peso = peso;
        this.tamañoArchivo = tamañoArchivo;
    }

    @Override
    public double CalcularCostoTotal() {
         return this.getPrecio()*this.getCantidad()+(0.5* tamañoArchivo)+(peso*0.10);
        
    };   
    @Override
     public void enviarPorCorreo() {
         System.out.println("Enviando producto mixto ¿quiere que venga a la tienda o se lo enviamos?");
    }
    
}
    
    


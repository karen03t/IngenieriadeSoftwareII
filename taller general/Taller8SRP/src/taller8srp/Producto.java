/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8srp;

/**
 *
 * @author karen
 */
public class Producto {
    private String nombre;
    private int stock;
    private String categoria;
    private int impuesto;

    public Producto(String nombre, int stock, String categoria, int impuesto) {
        this.nombre = nombre;
        this.stock = stock;
        this.categoria = categoria;
        this.impuesto = impuesto;
    }
    
    public void guardarProducto(String nombre, int stock, String categoria, int impuesto){
        System.out.println("Datos del producto a guardar: ");
        
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the impuesto
     */
    public int getImpuesto() {
        return impuesto;
    }

    /**
     * @param impuesto the impuesto to set
     */
    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }
    
}

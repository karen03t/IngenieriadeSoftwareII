/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10_princiosgrasp;

/**
 *
 * @author karen
 */
public class Entrada {
    private String tipo;
    private double precio;
    private boolean disponible;

    // Constructor
    public Entrada(String tipo, double precio, boolean disponible) {
        this.tipo = tipo;
        this.precio = precio;
        this.disponible = disponible;
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}

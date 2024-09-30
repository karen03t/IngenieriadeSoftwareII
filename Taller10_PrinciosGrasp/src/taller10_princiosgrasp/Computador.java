/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10_princiosgrasp;

/**
 *
 * @author karen
 */
public class Computador {
 private String procesador;
 private String tarjetaGrafica;
 private String ram;
 private double precio;

    public Computador(String procesador, String tarjetaGrafica, String ram, double precio) {
        this.procesador = procesador;
        this.tarjetaGrafica = tarjetaGrafica;
        this.ram = ram;
        this.precio = precio;
    }

    /**
     * @return the procesador
     */
    public String getProcesador() {
        return procesador;
    }

    /**
     * @param procesador the procesador to set
     */
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    /**
     * @return the tarjetaGrafica
     */
    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    /**
     * @param tarjetaGrafica the tarjetaGrafica to set
     */
    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    /**
     * @return the ram
     */
    public String getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(String ram) {
        this.ram = ram;
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
 
 
}



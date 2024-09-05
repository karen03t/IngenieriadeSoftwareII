/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7paquete;

/**
 *
 * @author karen
 */
public class PaquetePequeño extends PesoPaquete implements IPaquetePequeño{

    private double dimension;
    private double valorDeclarado;

    public PaquetePequeño(double dimension, double valorDeclarado, double peso) {
        super(peso);
        this.dimension = dimension;
        this.valorDeclarado = valorDeclarado;
    }

     @Override
    public void CalcularCostoEnvioPequeño(double peso, double dimension, double valorDeclarado) {
        double envioTotal;
        envioTotal = (peso*this.dimension)+this.valorDeclarado;
 
    }

    /**
     * @return the dimensiones
     */
    public double getDimension() {
        return dimension;
    }

    /**
     * @param dimensiones the dimensiones to set
     */
    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    /**
     * @return the valorDeclarado
     */
    public double getValorDeclarado() {
        return valorDeclarado;
    }

    /**
     * @param valorDeclarado the valorDeclarado to set
     */
    public void setValorDeclarado(double valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

   
    
    
    
     
}

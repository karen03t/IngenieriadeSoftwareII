/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5;

/**
 *
 * @author karen
 */
public class Cuenta {
    private String numero;
    private double saldo;

    public Cuenta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    
     public void depositar(double monto) {
        if (monto <= 0) throw new IllegalArgumentException("Monto inválido.");
        saldo += monto;
    }
     public void retirar(double monto) {
        if (monto > saldo) throw new IllegalArgumentException("Saldo insuficiente.");
        saldo -= monto;
    }
    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}

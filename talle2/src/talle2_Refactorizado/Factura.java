/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talle2_Refactorizado;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author karen
 */
public class Factura {
    private static List<Factura> listaFacturas = new ArrayList<>();
    private int numeroFactura = 0;
    private String nit;
    private String telefono;
    private String direccion;
    private Date fechaImpresion;
    private String medioDePago;
    private Cliente cliente;

    public Factura(String nit, String telefono, String direccion, Date fechaImpresion, String medioDePago, Cliente cliente) {
        this.nit = nit;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaImpresion = fechaImpresion;
        this.medioDePago = medioDePago;
        this.cliente = cliente;
    }

    public void guardarFactura( Cliente cliente, String nit, String telefono, String direccion, Date fechaImpresion, String medioDePago){
        numeroFactura++;
        this.cliente = cliente;
        this.nit = nit;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaImpresion = fechaImpresion;
        this.medioDePago = medioDePago;
        getListaFacturas().add(this);
        System.out.println("numero de Factura: " + this.numeroFactura);
        System.out.println("nit: " + this.nit);
        System.out.println("telefono: " + this.telefono);
        System.out.println("direccion: " + this.direccion);
        System.out.println("Fecha de Impresión: " + this.fechaImpresion);
        System.out.println("Medio de Pago: " + this.medioDePago);
        
    }

    
    /**
     * @return the numeroFactura
     */
    public int getNumeroFactura() {
        return numeroFactura;
    }

    /**
     * @param numeroFactura the numeroFactura to set
     */
    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the Direccion to set
     */
    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the fechaImpresion
     */
    public Date getFechaImpresion() {
        return fechaImpresion;
    }

    /**
     * @param fechaImpresion the fechaImpresion to set
     */
    public void setFechaImpresion(Date fechaImpresion) {
        this.fechaImpresion = fechaImpresion;
    }

    /**
     * @return the medioDePago
     */
    public String getMedioDePago() {
        return medioDePago;
    }

    /**
     * @param medioDePago the medioDePago to set
     */
    public void setMedioDePago(String medioDePago) {
        this.medioDePago = medioDePago;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the listaFacturas
     */
    public static List<Factura> getListaFacturas() {
        return listaFacturas;
    }

    /**
     * @param aListaFacturas the listaFacturas to set
     */
    public static void setListaFacturas(List<Factura> aListaFacturas) {
        listaFacturas = aListaFacturas;
    }
    
    
    
    
    
}

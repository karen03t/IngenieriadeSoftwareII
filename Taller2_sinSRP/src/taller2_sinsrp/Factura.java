/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2_sinsrp;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author karen
 */
public class Factura {
    private List<Factura> listaFacturas = new ArrayList<>();
    private int numeroFactura = 1;
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
        setNumeroFactura(getNumeroFactura()+1);
        this.setCliente(cliente);
        this.setNit(nit);
        this.setTelefono(telefono);
        this.setDireccion(direccion);
        this.setFechaImpresion(fechaImpresion);
        this.setMedioDePago(medioDePago);
        getListaFacturas().add(this);
        System.out.println("\nnumero de Factura: " + this.getNumeroFactura());
        System.out.println("nit: " + this.getNit());
        System.out.println("telefono: " + this.getTelefono());
        System.out.println("direccion: " + this.getDireccion());
        System.out.println("Fecha de Impresión: " + this.getFechaImpresion());
        System.out.println("Medio de Pago: " + this.getMedioDePago());
        
    }
    public void enviarEmailFactura(Factura factura){
        System.out.println("\n-Hola Esta Es la Factura de tu Compra-");
        System.out.println("numero de Factura: "+ factura.getNumeroFactura());
        System.out.println("- "+ factura.getCliente().getNombre());
        System.out.println("Nit de la empresa : "+ factura.getNit());
        System.out.println("Nuestro telefono: "+factura.getTelefono());
        System.out.println("Esatmos Ubicados en: " + factura.getDireccion());
        System.out.println("Fecha de impresion: "+ factura.getFechaImpresion());
        System.out.println("Medio de Pago: "+ factura.getMedioDePago());

    }
    public void generarReporteFacturas( int mes, int año){
        List<Integer> facturasDelMes = new ArrayList<>();
        for(Factura factura : listaFacturas){
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(factura.getFechaImpresion());
            int mesFactura= calendario.get(Calendar.MONTH);
            int añoFactura= calendario.get(Calendar.YEAR);
            if(mesFactura == mes && añoFactura == año){
                facturasDelMes.add(factura.getNumeroFactura());
            }
        }
        
        System.out.println("\nFacturas del  mes son: ");
        for(Integer numeroFactura : facturasDelMes){
            System.out.println("Factura nuemro: "+ numeroFactura);
        }
    }
    public void enviarInformacionFactura(Factura factura) {
        Cliente cliente = factura.getCliente();
       
        System.out.println("\nEnviando informacion a la DIAN");
        System.out.println("Número de Factura: " + factura.getNumeroFactura());
        System.out.println("NIT: " + factura.getNit());
        System.out.println("Teléfono: " + factura.getTelefono());
        System.out.println("Direccion: " + factura.getDireccion());
        System.out.println("Fecha de Impresión: " + factura.getFechaImpresion());
        System.out.println("Medio de Pago: " + factura.getMedioDePago());
        
        System.out.println("\nDetalles del Cliente:");
        System.out.println("Nombre del Cliente: " + cliente.getNombre());
        System.out.println("Cedula del Cliente: "+cliente.getCedula());
        System.out.println("Correo del Cliente: "+cliente.getCorreo());
        System.out.println("Direccion del Cliente: "+cliente.getDireccion());
       
    }

    /**
     * @return the listaFacturas
     */
    public List<Factura> getListaFacturas() {
        return listaFacturas;
    }

    /**
     * @param listaFacturas the listaFacturas to set
     */
    public void setListaFacturas(List<Factura> listaFacturas) {
        this.listaFacturas = listaFacturas;
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
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
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
    
    
    
}

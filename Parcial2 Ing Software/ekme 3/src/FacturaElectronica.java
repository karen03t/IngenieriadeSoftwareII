/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karen
 */
public class FacturaElectronica implements CrearFactura{

    private String numeroElectronico;
    private Cliente cliente;

    public FacturaElectronica(String numeroElectronico, Cliente cliente) {
        this.numeroElectronico = numeroElectronico;
        this.cliente = cliente;
    }
    
     @Override
    public void factura(String codigo, double factura) {
           
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the numeroElectronico
     */
    public String getNumeroElectronico() {
        return numeroElectronico;
    }

    /**
     * @param numeroElectronico the numeroElectronico to set
     */
    public void setNumeroElectronico(String numeroElectronico) {
        this.numeroElectronico = numeroElectronico;
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

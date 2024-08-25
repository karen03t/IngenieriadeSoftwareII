/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2_sinsrp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karen
 */
public class Cliente {
    private List<Cliente> datosCliente= new ArrayList<>();
       private String nombre;
       private String correo;
       private String direccion;
       private String cedula;

    public Cliente(String nombre, String correo, String direccion, String cedula) {
        //this.datosCliente = datosCliente;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.cedula = cedula;
    }
    
    public void guardarCliente(){
        getDatosCliente().add(this);
        System.out.println("nombre: " + getNombre());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Cedula: " + getCedula());
    }

    /**
     * @return the datosCliente
     */
    public List<Cliente> getDatosCliente() {
        return datosCliente;
    }

    /**
     * @param datosCliente the datosCliente to set
     */
    public void setDatosCliente(List<Cliente> datosCliente) {
        this.datosCliente = datosCliente;
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
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
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
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
    
    
}

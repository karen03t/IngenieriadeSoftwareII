/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talle2_Refactorizado;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un Cliente.
 */
public class Cliente {
    private static List<Cliente> datosCliente = new ArrayList<>();
    private String nombre;
    private String correo;
    private String direccion;
    private String cedula;

    public Cliente(String nombre, String correo, String direccion, String cedula) {
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.cedula = cedula;
    }

    public void guardarCliente() {
        datosCliente.add(this);
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Dirección: " + direccion);
        System.out.println("Cédula: " + cedula);
    }

    public static List<Cliente> getDatosCliente() {
        return datosCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}

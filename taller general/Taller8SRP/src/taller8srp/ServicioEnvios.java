/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8srp;

/**
 *
 * @author karen
 */
public class ServicioEnvios {
    private String direccion; 

    public ServicioEnvios(String direccion) {
        this.direccion = direccion;
    }
    public void EnviarADomicilio(String direccion){
        System.out.println("enviando a "+ direccion);
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
     
}

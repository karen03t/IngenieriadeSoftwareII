/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2patronbuilder;

/**
 *
 * @author juanm
 */
public class Vehiculo {
    private String tipo;
    private String color;
    private String puertas;
    private boolean aireAcondicionado;
    private boolean navegacionCrucero;
    
    public Vehiculo(Builder builder){
        this.tipo = builder.tipo;
        this.color = builder.color;
        this.puertas = builder.puertas;
        this.aireAcondicionado = builder.aireAcondicionado;
        this.navegacionCrucero = builder.navegacionCrucero;
        
        public void informacionVehiculo(){
            System.out.println(tipo);
            System.out.println(color);
            System.out.println(puertas);
        }
    }
}

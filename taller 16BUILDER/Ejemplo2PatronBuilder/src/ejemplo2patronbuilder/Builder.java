/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2patronbuilder;

/**
 *
 * @author juanm
 */
public class Builder {
    private String tipo;
    private String color;
    private String puertas;
    private boolean aireAcondicionado;
    private boolean navegacionCrucero;
    
    public Builder setTipo(String tipo){
        this.tipo = tipo;
        return this;
    }
    
    public Builder setColor(String color){
        this.color = color;
        return this;
    }
    
    public Builder setPuertas(String puertas){
        this.puertas = puertas;
        return this;
    }
    
    public Builder setAireAcondicionado(boolean aireAcondicionado){
        
        this.aireAcondicionado = aireAcondicionado;
        return this;
    }
    
    public Builder setNavegacionCrucero (boolean navegacionCrucero){
        this.navegacionCrucero = navegacionCrucero;
        return this;
    }   
    public Vehiculo build(){
        return new Vehiculo(this);
    }

}

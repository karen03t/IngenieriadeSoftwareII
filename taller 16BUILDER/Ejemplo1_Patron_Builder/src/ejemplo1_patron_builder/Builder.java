/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1_patron_builder;

import java.util.List;

/**
 *
 * @author juanm
 */
public abstract class Builder {
    private String masa;
    private String tamaño;
    private List<String> ingredientes;
    
    public Builder setMasa(String masa){
        this.masa = masa;
        return this;
    }
    
    public Builder setTamaño(String tamaño){
        this.tamaño = tamaño;
        return this;
    }
    
    public Builder setIngredientes(List<String> ingredientes){
        this.ingredientes = ingredientes;
        return this;
    }
    
    public Pizza build(){
        return new Pizza(this);
    }
}

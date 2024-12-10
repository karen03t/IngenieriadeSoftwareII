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
public class Pizza {
    private String masa;
    private String tamaño;
    private List<String> ingredientes;
    
    private Pizza(Builder builder){
        this.masa = builder.masa;
        this.tamaño = builder.tamaño;
        this.ingredientes = builder.ingredientes;
    }
    
    @Override
    public String toString() {
        return masa + " _ " + tamaño;
    }
}

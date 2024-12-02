/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuarta;

/**
 *
 * @author hp
 */
public class Cuarta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Configuracion config = Configuracion.getInstancia();
        
        System.out.println("url"+config.getUrl());
        System.out.println("usuario"+config.getUsuario());
        System.out.println("password"+config.getPassword());
        
        
        
        Configuracion otra =Configuracion.getInstancia();
        
        System.out.println("es la misma "+ (config == otra));
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_patron_singleton;

/**
 *
 * @author juanm
 */
public class Ejemplo_Patron_Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Obtener la única instancia de Configuración  
       Configuracion config = Configuracion.getInstancia("localhost:5432", "root", "root");
       
       //Mostrar configuración
       System.out.println("URL:" + config.getUrl());
       System.out.println("Usuario:" + config.getUsuario());
       System.out.println("Password:" + config.getPassword());
       
       //Verificar que ambas referencias apuntan a la misma intancia
       Configuracion otraConfig = Configuracion.getInstancia("localhost:5432", "root", "root");
       System.out.println("¿Son la misma instancia?" + (config == otraConfig));
    }
    
}

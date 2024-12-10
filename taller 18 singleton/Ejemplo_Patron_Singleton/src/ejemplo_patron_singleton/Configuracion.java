/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_patron_singleton;

/**
 *
 * @author juanm
 */
public class Configuracion {
    private static Configuracion instancia;
    
    //Atributos de configuración 
    private String url;
    private String usuario;
    private String password;
    
    //Constructor privado
    private Configuracion(){
        //Inicializar con valores predeterminados
        this.url = "jdbc:mysql://localhost:3306/mi_base_de_datos";
        this.usuario = "root";
        this.password = "password";
    }
    
    //Método para obtener la instancia 
    public static Configuracion getInstancia(String url, String usuario, String password){
        if (instancia == null){
            instancia = new Configuracion();
        }
        return instancia;
    }
    //Getters
    public String getUrl(){
        return url;
    }
    public String getUsuario(){
        return usuario;
    }
    public String getPassword(){
        return password;
    }
}

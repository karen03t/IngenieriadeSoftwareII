/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuarta;

/**
 *
 * @author hp
 */
public class Configuracion {
    
    private static Configuracion instancia;
    
    private String url ;
    private String usuario;
    private String password; 

    public Configuracion() {
        this.url ="aaaaaaaa";
        this.usuario= "karen";
        this.password= "password";
    }
    
    public static Configuracion getInstancia(){
        if (instancia == null){
            instancia = new Configuracion();
        }
        return instancia;
    }

    /**
     * @param aInstancia the instancia to set
     */
    public static void setInstancia(Configuracion aInstancia) {
        instancia = aInstancia;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
       
    
    
}

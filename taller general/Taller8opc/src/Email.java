/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karen
 */
public abstract class Email {
    
        private String destinatario;
        private String sujeto;
        private String cuerpo;
        private String imagen;

    public Email(String destinatario, String sujeto, String cuerpo, String imagen) {
        this.destinatario = destinatario;
        this.sujeto = sujeto;
        this.cuerpo = cuerpo;
        this.imagen = imagen;
    }

    /**
     * @return the destinatario
     */
    public String getDestinatario() {
        return destinatario;
    }

    /**
     * @param destinatario the destinatario to set
     */
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    /**
     * @return the sujeto
     */
    public String getSujeto() {
        return sujeto;
    }

    /**
     * @param sujeto the sujeto to set
     */
    public void setSujeto(String sujeto) {
        this.sujeto = sujeto;
    }

    /**
     * @return the cuerpo
     */
    public String getCuerpo() {
        return cuerpo;
    }

    /**
     * @param cuerpo the cuerpo to set
     */
    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
        
}

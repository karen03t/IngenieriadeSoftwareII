/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6l;

/**
 *
 * @author karen
 */
public class Libro implements LibreriaLibro {
    private String nombre;
    private int numeroHojas;
    private String imagen;
    private String serial;

    public Libro(String nombre, int numeroHojas, String imagen, String serial) {
        this.nombre = nombre;
        this.numeroHojas = numeroHojas;
        this.imagen = imagen;
        this.serial = serial;
    }

    @Override
    public void prestar() {
        System.out.println("El libro '" + getNombre() + "' ha sido prestado.");
    }

    @Override
    public void devolver() {
        System.out.println("El libro '" + getNombre() + "' ha sido devuelto.");
    }

    @Override
    public void renovacionDePortada() {
        System.out.println("La portada del libro '" + getNombre() + "' ha sido renovada.");
    }

    @Override
    public void mantenimientoDeHojas() {
        System.out.println("Se ha realizado el mantenimiento de las hojas del libro '" + getNombre() + "'. Número de hojas: " + getNumeroHojas());
    }

    @Override
    public void solicitarNuevaVersion() {
        System.out.println("Se ha solicitado una nueva versión del libro '" + getNombre() + "' con el serial '" + getSerial() + "'.");
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the numeroHojas
     */
    public int getNumeroHojas() {
        return numeroHojas;
    }

    /**
     * @param numeroHojas the numeroHojas to set
     */
    public void setNumeroHojas(int numeroHojas) {
        this.numeroHojas = numeroHojas;
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

    /**
     * @return the serial
     */
    public String getSerial() {
        return serial;
    }

    /**
     * @param serial the serial to set
     */
    public void setSerial(String serial) {
        this.serial = serial;
    }
    
}

    
    


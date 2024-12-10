/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1patronprototype;

/**
 *
 * @author juanm
 */
public class Libro implements Prototype{
    private String titulo;
    private String autor;
    
    public Libro (String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    @Override
    public Prototype clone (){
        return new Libro(titulo, autor);
    }
    
    @Override
    public String toString(){
        return titulo + " _ " + autor;
    }
}

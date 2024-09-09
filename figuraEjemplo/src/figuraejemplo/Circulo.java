/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuraejemplo;

/**
 *
 * @author karen
 */
public class Circulo implements Shape{
    private double radius;

    public Circulo(double radius) {
        this.radius = radius;
    }
    
     
    @Override
    public double getArea() {
        return Math.PI* radius * radius;
    }
    
}

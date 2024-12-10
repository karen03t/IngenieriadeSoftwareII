/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2patronbuilder;

/**
 *
 * @author juanm
 */
public class Ejemplo2PatronBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Builder builder = new Builder()
                .setTipo("TIPO")
                .setColor("ROJO")
                .setPuertas("PUERTAS");
        Vehiculo vehiculo = builder.build();
        vehiculo.informacionVehiculo();
        
        builder.setColor("VERDE");
        Vehiculo vehiculo2 = builder.build();
        vehiculo.informacionVehiculo();
    }
    
}

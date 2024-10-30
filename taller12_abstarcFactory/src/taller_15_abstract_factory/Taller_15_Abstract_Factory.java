/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_15_abstract_factory;

/**
 *
 * @author karen
 */
public class Taller_15_Abstract_Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        FabricaMueblesModernos fabricaModerna = new FabricaMueblesModernos();
        Silla sillaModerna = fabricaModerna.crearSilla();
        Mesa mesaModerna = fabricaModerna.crearMesa();
        sillaModerna.crear();
        mesaModerna.crear();

        FabricaMueblesClasicos fabricaClasica = new FabricaMueblesClasicos();
        Silla sillaClasica = fabricaClasica.crearSilla();
        Mesa mesaClasica = fabricaClasica.crearMesa();
        sillaClasica.crear();
        mesaClasica.crear();
    }
    
}

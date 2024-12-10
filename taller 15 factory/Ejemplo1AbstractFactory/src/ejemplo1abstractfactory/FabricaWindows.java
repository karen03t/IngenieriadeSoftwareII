/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1abstractfactory;

/**
 *
 * @author juanm
 */
public class FabricaWindows implements Fabrica {
    @Override
    public Botón crearBoton(){
        return new BotónWindows();
    }
    
    @Override 
    public CuadroTexto crearCuadroTexto(){
        return new CuadroTextoWindows();
    }
}

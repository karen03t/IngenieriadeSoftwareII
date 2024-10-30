/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejmplo15factorymethod;

/**
 *
 * @author karen
 */
public class CreadoraEnvioRegular extends Creadora{

    @Override
    public ServicioEnvio crearServicioEnvio() {
       return  new EnvioRegular();
    }
    
}

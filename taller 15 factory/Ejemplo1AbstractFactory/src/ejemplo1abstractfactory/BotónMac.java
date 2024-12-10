/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1abstractfactory;

/**
 *
 * @author juanm
 */
public class BotónMac implements Botón {
    
    @Override
    public void renderizar(){
        System.out.println("ESTOY RENDERIZANDO UN BOTÓN DE MAC");
    }
}

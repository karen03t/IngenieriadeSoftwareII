/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1abstractfactory;

/**
 *
 * @author juanm
 */
public class CuadroTextoWindows implements CuadroTexto {
    
    @Override
    public void renderizar(){
        System.out.println("ESTOY RENDERIZANDO UN CUADRO DE TEXTO DE WINDOWS");
    }
}

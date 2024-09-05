/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author karen
 */
public interface IPorcesarOrdenDHL {
     void enviarOrdenDHL(Orden orden);
    void cancelarEnvioDHL(Orden orden);
    void personalizarEnvioDHL(Orden orden);
}

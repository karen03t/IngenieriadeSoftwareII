/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karen
 */
public class ProcesarOrden implements IProcesarOrden{

    @Override
    public void enviarOrden(Orden orden) {
        System.out.println("datos de su orden: "+ orden.getPersona()+orden.getOrigen()+orden.getDestino ()+ orden.getFecha());
    }
    
}

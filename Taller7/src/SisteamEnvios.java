/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karen
 */
public class SisteamEnvios  {
    
     private IProcesarOrden procesarOrden;
     ProcesarOrdenFedex procesarOrdenFedex;
     ProcesarOrdenDHL procesarOrdenDHL;
     ProcesarOrdenUPS procesarOrdenUPS;

    public SisteamEnvios(IProcesarOrden procesarOrden) {
        this.procesarOrden = procesarOrden;
    }
    public void enviarOrden(Orden orden){
        procesarOrden.enviarOrden(orden);
    }
    public 
}

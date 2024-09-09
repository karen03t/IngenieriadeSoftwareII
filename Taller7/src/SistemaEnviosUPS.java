/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karen
 */
public class SistemaEnviosUPS extends SisteamEnvios implements IProcesarOrdenUPS{
   
    
    private IProcesarOrdenUPS procesarOrdenUPS;

    public SistemaEnviosUPS(IProcesarOrdenUPS procesarOrdenUPS, IProcesarOrden procesarOrden) {
        super(procesarOrden);
        this.procesarOrdenUPS = procesarOrdenUPS;
    }

    @Override
    public void enviarOrdenUPS(Orden orden) {
        getProcesarOrdenDHL().enviarOrdenDHL(orden);
    }

    @Override
    public void cancelarEnvioUPS(Orden orden) {
        procesarOrdenUPS.enviarOrdenUPS(orden);
    }
    
}

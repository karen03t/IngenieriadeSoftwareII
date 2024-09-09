/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karen
 */
public class SistemaEnviosFedex  extends SisteamEnvios implements IProcesarOrderFedex{
    
    private IProcesarOrderFedex procesarOrderFedex;

    public SistemaEnviosFedex(IProcesarOrderFedex procesarOrderFedex, IProcesarOrden procesarOrden) {
        super(procesarOrden);
        this.procesarOrderFedex = procesarOrderFedex;
    }

    @Override
    public void enviarOrdenFedex(Orden orden) {
        getProcesarOrdenFedex().enviarOrdenFedex(orden);
    }

    @Override
    public void cancelarEnvioFedex(Orden orden) {
        getProcesarOrdenFedex().cancelarEnvioFedex(orden);
    }
    
    
}

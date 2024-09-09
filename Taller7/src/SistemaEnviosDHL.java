/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karen
 */
public class SistemaEnviosDHL extends SisteamEnvios implements IPorcesarOrdenDHL{
    private IPorcesarOrdenDHL procesarOrdeDHL;

    public SistemaEnviosDHL(IPorcesarOrdenDHL procesarOrdeDHL, IProcesarOrden procesarOrden) {
        super(procesarOrden);
        this.procesarOrdeDHL = procesarOrdeDHL;
    }

     @Override
    public void enviarOrdenDHL(Orden orden) {
        getProcesarOrdenDHL().enviarOrdenDHL(orden);
    }

    @Override
    public void cancelarEnvioDHL(Orden orden) {
        getProcesarOrdenDHL().cancelarEnvioDHL(orden);
    }

    @Override
    public void personalizarEnvioDHL(Orden orden) {
        getProcesarOrdenDHL().personalizarEnvioDHL(orden);
    }
}

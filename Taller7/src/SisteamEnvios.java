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

     private ProcesarOrdenFedex procesarOrdenFedex;
     private ProcesarOrdenDHL procesarOrdenDHL;
     private ProcesarOrdenUPS procesarOrdenUPS;


    public SisteamEnvios(IProcesarOrden procesarOrden) {
        this.procesarOrden = procesarOrden;
    }
    public void enviarOrden(Orden orden){
        getProcesarOrden().enviarOrden(orden);
    }

    /**
     * @return the procesarOrden
     */
    public IProcesarOrden getProcesarOrden() {
        return procesarOrden;
    }

    /**
     * @param procesarOrden the procesarOrden to set
     */
    public void setProcesarOrden(IProcesarOrden procesarOrden) {
        this.procesarOrden = procesarOrden;
    }

    /**
     * @return the procesarOrdenFedex
     */
    public ProcesarOrdenFedex getProcesarOrdenFedex() {
        return procesarOrdenFedex;
    }

    /**
     * @param procesarOrdenFedex the procesarOrdenFedex to set
     */
    public void setProcesarOrdenFedex(ProcesarOrdenFedex procesarOrdenFedex) {
        this.procesarOrdenFedex = procesarOrdenFedex;
    }

    /**
     * @return the procesarOrdenDHL
     */
    public ProcesarOrdenDHL getProcesarOrdenDHL() {
        return procesarOrdenDHL;
    }

    /**
     * @param procesarOrdenDHL the procesarOrdenDHL to set
     */
    public void setProcesarOrdenDHL(ProcesarOrdenDHL procesarOrdenDHL) {
        this.procesarOrdenDHL = procesarOrdenDHL;
    }

    /**
     * @return the procesarOrdenUPS
     */
    public ProcesarOrdenUPS getProcesarOrdenUPS() {
        return procesarOrdenUPS;
    }

    /**
     * @param procesarOrdenUPS the procesarOrdenUPS to set
     */
    public void setProcesarOrdenUPS(ProcesarOrdenUPS procesarOrdenUPS) {
        this.procesarOrdenUPS = procesarOrdenUPS;
    }
    
    }
    


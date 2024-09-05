/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author karen
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IProcesarOrden procesarOrden = new ProcesarOrden();
        SisteamEnvios sistemaEnvios = new SisteamEnvios(procesarOrden);
        Orden orden = new Orden("manizales", "Bogota ", "02*09*2024", "karen orrego");
        sistemaEnvios.enviarOrden(orden);
    }
    
    
}

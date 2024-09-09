/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author karen
 */
public class main {


    public static void main(String[] args) {
        // Crear una orden
        Orden orden = new Orden("Manizales", "Bogotá", "02/09/2024", "Karen Orrego");

        // Crear instancias de los procesadores de órdenes
        IProcesarOrden procesarOrden = new ProcesarOrden();
        IPorcesarOrdenDHL procesarOrdenDHL = new ProcesarOrdenDHL();
        IProcesarOrdenUPS procesarOrdenUPS = new ProcesarOrdenUPS();
        IProcesarOrderFedex procesarOrdenFedex = new ProcesarOrdenFedex();

        // Crear instancias del sistema de envíos con diferentes procesadores
        SisteamEnvios sistemaEnviosGenerico = new SisteamEnvios(procesarOrden);
        SistemaEnviosDHL sistemaEnviosDHL = new SistemaEnviosDHL(procesarOrdenDHL, procesarOrden);
        SistemaEnviosUPS sistemaEnviosUPS = new SistemaEnviosUPS(procesarOrdenUPS, procesarOrden);
        SistemaEnviosFedex sistemaEnviosFedex = new SistemaEnviosFedex(procesarOrdenFedex, procesarOrden);

        // Usar el sistema de envíos genérico
        System.out.println("Usando sistema de envíos genérico:");
        sistemaEnviosGenerico.enviarOrden(orden);

        // Usar el sistema de envíos DHL
        System.out.println("\nUsando sistema de envíos DHL:");
        sistemaEnviosDHL.enviarOrden(orden);
        sistemaEnviosDHL.cancelarEnvioDHL(orden);
        sistemaEnviosDHL.personalizarEnvioDHL(orden);

        // Usar el sistema de envíos UPS
        System.out.println("\nUsando sistema de envíos UPS:");
        sistemaEnviosUPS.enviarOrden(orden);
        sistemaEnviosUPS.cancelarEnvioUPS(orden);

        // Usar el sistema de envíos Fedex
        System.out.println("\nUsando sistema de envíos Fedex:");
        sistemaEnviosFedex.enviarOrden(orden);
        sistemaEnviosFedex.cancelarEnvioFedex(orden);
    }
}

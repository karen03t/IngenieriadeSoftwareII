/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller10_princiosgrasp;

/**
 *
 * @author karen
 */
public class Taller10_PrinciosGrasp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computador comp1 = new Computador("Intel i7", "NVIDIA RTX 3060", "16", 1200.00);
        Computador comp2 = new Computador("AMD Ryzen 5", "NVIDIA GTX 1660", "8", 900.00);
        Computador comp3 = new Computador("Intel i5", "AMD Radeon RX 570", "4", 750.00);

        // Crear una orden
        Orden orden = new Orden();

        // Agregar computadoras a la orden
        orden.agregarComputador(comp1);
        orden.agregarComputador(comp2);
        orden.agregarComputador(comp3);

        // Mostrar las computadoras en la orden
        System.out.println("Computadoras en la orden:");
        orden.mostrarComputadores();

        // Calcular y mostrar el total
        double total = orden.calcularTotal();
        System.out.println("\nTotal de la orden: $" + total);
    
    // PRINCIPIO CONTROLADOR
        Entrada entradaGeneral = new Entrada("General", 50.0, true);
        Entrada entradaVIP = new Entrada("VIP", 100.0, true);

        // Crear un usuario
        Usuario usuario = new Usuario("Karen");

        // Crear un controlador de compra
        ControladorCompra controladorCompra = new ControladorCompra();

        // Agregar entradas al controlador
        controladorCompra.agregarEntrada(entradaGeneral);
        controladorCompra.agregarEntrada(entradaVIP);

        // Mostrar entradas disponibles
        controladorCompra.mostrarEntradasDisponibles();

        // Comprar una entrada general
        System.out.println("\nIntentando comprar una entrada general:");
        controladorCompra.procesarCompra(usuario, "General");

        // Intentar comprar la misma entrada nuevamente
        System.out.println("\nIntentando comprar la misma entrada general nuevamente:");
        controladorCompra.procesarCompra(usuario, "General");

        // Comprar una entrada VIP
        System.out.println("\nIntentando comprar una entrada VIP:");
        controladorCompra.procesarCompra(usuario, "VIP");

        // Mostrar entradas disponibles después de las compras
        System.out.println("\nEntradas disponibles después de las compras:");
        controladorCompra.mostrarEntradasDisponibles();
    
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10_princiosgrasp;

/**
 *
 * @author karen
 */
public class ControladorCompra {
    private Map<String, Entrada> entradasDisponibles = new HashMap<>();  // Inventario de entradas

    // Agregar entradas disponibles al inventario
    public void agregarEntrada(Entrada entrada) {
        entradasDisponibles.put(entrada.getTipo(), entrada);
    }

    // Método para procesar la compra
    public void procesarCompra(Usuario usuario, String tipoEntrada) {
        Entrada entrada = entradasDisponibles.get(tipoEntrada);

        if (entrada == null) {
            System.out.println("El tipo de entrada no existe.");
            return;
        }

        if (entrada.isDisponible()) {
            // Marcar la entrada como no disponible
            entrada.setDisponible(false);

            // Simular procesamiento de pago
            procesarPago(usuario, entrada.getPrecio());

            System.out.println("Compra realizada con éxito para " + usuario.getNombre());
        } else {
            System.out.println("Lo siento, la entrada " + tipoEntrada + " no está disponible.");
        }
    }
private void procesarPago(Usuario usuario, double monto) {
        System.out.println("Procesando el pago de $" + monto + " para " + usuario.getNombre());
        System.out.println("Pago realizado con éxito.");
    }
public void mostrarEntradasDisponibles() {
        System.out.println("Entradas disponibles:");
        for (Entrada entrada : entradasDisponibles.values()) {
            System.out.println("Tipo: " + entrada.getTipo() + ", Precio: $" + entrada.getPrecio() +
                               ", Disponible: " + (entrada.isDisponible() ? "Sí" : "No"));
        }
    }
}
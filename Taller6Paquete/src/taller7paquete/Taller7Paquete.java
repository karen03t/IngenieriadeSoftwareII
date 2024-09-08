/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller7paquete;

import java.util.Scanner;

/**
 *
 * @author karen
 */
public class Taller7Paquete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione el tipo de paquete: \n1. Paquete Pequeño \n2. Paquete Grande \n3. Paquete Peligroso \n4 salir ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    
                    System.out.print("Ingrese la dimensión del paquete pequeño: ");
                    double dimensionP = scanner.nextDouble();
                    System.out.print("Ingrese el valor declarado: ");
                    double valorDeclarado = scanner.nextDouble();
                    System.out.print("Ingrese el peso: ");
                    double pesoP = scanner.nextDouble();

                    PaquetePequeño paquetePequeño = new PaquetePequeño(dimensionP, valorDeclarado, pesoP);
                    paquetePequeño.CalcularCostoEnvioPequeño(dimensionP, valorDeclarado);
                    break;

                case 2:
                    System.out.print("Ingrese el volumen del paquete grande: ");
                    double volumenG = scanner.nextDouble();
                    System.out.print("Ingrese el medio de transporte (aereo, terrestre, mar): ");
                    String medioTransporteG = scanner.next();
                    System.out.print("Ingrese el peso: ");
                    double pesoG = scanner.nextDouble();

                    PaqueteGrande paqueteGrande = new PaqueteGrande(volumenG, medioTransporteG, pesoG);
                    paqueteGrande.calcularCostoPaqueteGrande(pesoG, volumenG, medioTransporteG);
                    break;

                case 3:
                    // Paquete Peligroso
                    System.out.print("Ingrese las dimensiones del paquete peligroso: ");
                    double dimensionesPeligroso = scanner.nextDouble();
                    System.out.print("Ingrese el volumen: ");
                    double volumenP = scanner.nextDouble();
                    System.out.print("Ingrese el medio de transporte (aereo, terrestre, mar): ");
                    String medioTransporteP = scanner.next();
                    System.out.print("Ingrese el peso: ");
                    double pesoPeligroso = scanner.nextDouble();
                    System.out.print("¿Tiene etiqueta de peligro? (true/false): ");
                    boolean etiquetaPeligro = scanner.nextBoolean();
                    System.out.print("¿Requiere embalaje especial? (true/false): ");
                    boolean embalajeEspecial = scanner.nextBoolean();

                    PaquetePeligroso paquetePeligroso = new PaquetePeligroso(dimensionesPeligroso, volumenP, medioTransporteP, pesoPeligroso);
                    paquetePeligroso.calcularCostoPaquetePeligroso(pesoPeligroso, etiquetaPeligro, embalajeEspecial);
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
                    break;
            }

            System.out.println();

        } while (opcion != 4);

        scanner.close();
    }
    
}

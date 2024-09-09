/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7paquete;

/**
 *
 * @author karen
 */
public class PaqueteGrande extends PesoPaquete implements IPaqueteGrande{
     double volumen;
     String medioTransporte;

    public PaqueteGrande(double volumen, String medioTransporte, double peso) {
        super(peso);
        this.volumen = volumen;
        this.medioTransporte = medioTransporte;
    }

    @Override
    public void calcularCostoPaqueteGrande(double peso, double volumen, String medioTransporte) {
        double costoEnvio = 50000; 
        double costoPorPeso = peso *5000; 
        double costoPorVolumen = volumen * 3000;

        double costoTransporte = 0.0;
        System.out.println("los tipos de medio de transpote son: \naereo \nterrestre \nmar \nescribe la opcion que desee: \n");
        switch (medioTransporte.toLowerCase()) {
            case "aereo":
                costoTransporte = 100000;
                break;
            case "terrestre":
                costoTransporte = 50000;
                break;
            case "mar":
                costoTransporte = 80000;
                break;
            default:
                System.out.println("Medio de transporte no soportado.");
                return;
        }
        double costoTotal = costoEnvio + costoPorPeso + costoPorVolumen + costoTransporte;

        System.out.println("El costo del paquete grande es: $" + costoTotal);

    }
  
}

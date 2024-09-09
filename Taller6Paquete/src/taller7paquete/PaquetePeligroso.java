/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7paquete;

/**
 *
 * @author karen
 */
public class PaquetePeligroso  extends PesoPaquete implements IPaquetePeligroso{
    private double dimensiones;
    private double volumen; 
    private String medioTansporte; 

    public PaquetePeligroso(double dimensiones, double volumen, String medioTansporte, double peso) {
        super(peso);
        this.dimensiones = dimensiones;
        this.volumen = volumen;
        this.medioTansporte = medioTansporte;
    }

    @Override
    public void calcularCostoPaquetePeligroso(double peso, boolean etiquetaPeligro, boolean embalajeEspecial) {
       double costoBase = 100000;
        double costoPorPeso = peso * 3000; 
        double costoPorVolumen = volumen * 5000; 

        
        double costoEtiquetaPeligro = etiquetaPeligro ? 50000 : 0.0;

        
        double costoEmbalajeEspecial = embalajeEspecial ? 30000 : 0.0;

        
        double costoTransporte = 0.0;
        System.out.println("los tipos de medio de transpote son: \naereo \nterrestre \nmar \nescribe la opcion que desee: \n");
        switch (medioTansporte.toLowerCase()) {
            case "aereo":
                costoTransporte = 120.0;
                break;
            case "terrestre":
                costoTransporte = 60.0;
                break;
            case "maritimo":
                costoTransporte = 90.0;
                break;
            default:
                System.out.println("Medio de transporte no especificado.");
                return;
        }

        double costoTotal = costoBase + costoPorPeso + costoPorVolumen + costoEtiquetaPeligro + costoEmbalajeEspecial + costoTransporte;

        System.out.println("El costo del paquete peligroso es: " + costoTotal);
    }

    /**
     * @return the dimensiones
     */
    public double getDimensiones() {
        return dimensiones;
    }

    /**
     * @param dimensiones the dimensiones to set
     */
    public void setDimensiones(double dimensiones) {
        this.dimensiones = dimensiones;
    }

    /**
     * @return the volumen
     */
    public double getVolumen() {
        return volumen;
    }

    /**
     * @param volumen the volumen to set
     */
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    /**
     * @return the medioTansporte
     */
    public String getMedioTansporte() {
        return medioTansporte;
    }

    /**
     * @param medioTansporte the medioTansporte to set
     */
    public void setMedioTansporte(String medioTansporte) {
        this.medioTansporte = medioTansporte;
    }
     
    
    
    
}

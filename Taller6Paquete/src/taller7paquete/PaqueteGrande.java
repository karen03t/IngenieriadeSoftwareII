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
    public void calcularCostoPaqueteGrande(double peso, double volumen) {
    
    
    }
    
    
     
      
}

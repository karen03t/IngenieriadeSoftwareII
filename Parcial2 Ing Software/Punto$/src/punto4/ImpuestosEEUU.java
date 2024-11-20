/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto4;

/**
 *
 * @author karen
 */
public class ImpuestosEEUU implements Impuestos{
    private double impuestobaseEEUU;

    public ImpuestosEEUU(double impuestobaseEEUU) {
        this.impuestobaseEEUU = impuestobaseEEUU;
    }

    /**
     * @return the impuestobaseEEUU
     */
    public double getImpuestobaseEEUU() {
        return impuestobaseEEUU;
    }

    /**
     * @param impuestobaseEEUU the impuestobaseEEUU to set
     */
    public void setImpuestobaseEEUU(double impuestobaseEEUU) {
        this.impuestobaseEEUU = impuestobaseEEUU;
    }

    @Override
    public void calcularImpuesto(Double valor) {
        
    }
    
    
}

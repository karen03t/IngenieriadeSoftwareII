/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karen
 */
public class DescuentoTemporal extends Descuento{
    private float descuentoTemporal;

    public DescuentoTemporal(float descuentoTemporal, float valor) {
        super(valor);
        this.descuentoTemporal = descuentoTemporal;
    }

    
    public void CalcularDescuentoTemporal(){
        
    }

    /**
     * @return the descuentoTemporal
     */
    public float getDescuentoTemporal() {
        return descuentoTemporal;
    }

    /**
     * @param descuentoTemporal the descuentoTemporal to set
     */
    public void setDescuentoTemporal(float descuentoTemporal) {
        this.descuentoTemporal = descuentoTemporal;
    }
    
}

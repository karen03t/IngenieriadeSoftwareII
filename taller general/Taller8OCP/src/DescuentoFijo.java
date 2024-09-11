/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karen
 */
public class DescuentoFijo extends  Descuento{
    private float descuentoFijo;

    public DescuentoFijo(float descuentoFijo, float valor) {
        super(valor);
        this.descuentoFijo = descuentoFijo;
    }

   
    
    public void CalcularDescuentoFijo(){
        
    }

    /**
     * @return the descuentoFijo
     */
    public float getDescuentoFijo() {
        return descuentoFijo;
    }

    /**
     * @param descuentoFijo the descuentoFijo to set
     */
    public void setDescuentoFijo(float descuentoFijo) {
        this.descuentoFijo = descuentoFijo;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller4;

/**
 *
 * @author karen
 */
public class Taller4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Factura factura = new Factura ();
        CalculoImpuestoIva calculoIva = new CalculoImpuestoIva("Salchichas",4 , 6.300);
        ClaculoImpuestoReteIva calculoImpuReteIva = new ClaculoImpuestoReteIva("salchichas", 4, 6.300);
        CaculoImpuestoSaludable caculoImpuestoSaludable = new CaculoImpuestoSaludable("salchichas", 4, 6.300);
        
        System.out.println("Iva: "+factura.TotalDeImpuesto(calculoIva));
        System.out.println("Retencion de Iva: "+ factura.TotalDeImpuesto(calculoImpuReteIva));
        System.out.println("Impuesto Saludable: "+ factura.TotalDeImpuesto(caculoImpuestoSaludable));
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talle2_Refactorizado;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author karen
 */
public class ReporteFactura {
    public void generarReporteFacturas(List<Factura>listaFacturas, int mes, int año){
        List<Integer> facturasDelMes = new ArrayList<>();
        int mesAjustado= mes-1;
        for(Factura factura : listaFacturas){
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(factura.getFechaImpresion());
            int mesFactura= calendario.get(Calendar.MONTH);
            int añoFactura= calendario.get(Calendar.YEAR);
            if(mesFactura == mesAjustado && añoFactura == año){
                facturasDelMes.add(factura.getNumeroFactura());
            }
        }
        
        if (facturasDelMes.isEmpty()) {
            System.out.println("No hay facturas para el mes y año especificados.");
        } else {
            System.out.println("Facturas del mes " + (mes) + " del año " + año + ":");
            for (Integer numeroFactura : facturasDelMes) {
                System.out.println("Número de Factura: " + numeroFactura);
            }
        }
    }
}

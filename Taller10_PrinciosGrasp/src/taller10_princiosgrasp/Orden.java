/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10_princiosgrasp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karen
 */
public class Orden {
    private List<Computador> computadores = new ArrayList<>();
    public void agregarComputador(Computador computador){
        computadores.add(computador);
        
    }
    public double calcularTotal(){
        double total = 0;
        for (Computador computador : computadores){
            total += computador.getPrecio();
        }
        return total;
    }
   public void mostrarComputadores(){
       for(Computador computador : computadores){
           System.out.println("prcesador: "+ computador.getProcesador()+"\n"+
                   "Tarjeta grafica: "+ computador.getTarjetaGrafica()+"\n"+
                   "Ram"+ computador.getRam()+"\n");
       }
   } 
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication30;


/**
 *
 * @author karen
 */
public class OrdenEstado {
    int ordenId;
    

    public OrdenEstado(int ordenId) {
        this.ordenId = ordenId;
    }
    
    public String obtenerEstado(int ordenId){
        
        String estado;
        if(ordenId <0){
            estado= "orden ivalida";
            return estado;
        }
        else if(ordenId < 50 || ordenId == 0){
            estado="pendiente";
            return estado;
        }
        else{
           if(ordenId >50 && ordenId < 99){
                estado= "en proceso";
                return estado; 
                }
           else{
               estado="completado";
               return estado;
           }
         }
        
    }
}

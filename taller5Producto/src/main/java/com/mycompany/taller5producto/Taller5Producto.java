/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller5producto;

/**
 *
 * @author karen
 */
public class Taller5Producto {

    public static void main(String[] args) {
        Producto productoFisico1 = new ProductoFisico(20, "papas", 30, 40);
        Inventario inventario = new Inventario();
        inventario.calcular(productoFisico1);
        System.out.println("fisico");
        
        ProductoFisico productoFisico2 = new ProductoFisico(20, "cereal", 60, 80);
        productoFisico2.enviarPorCorreo();
        
    }
}

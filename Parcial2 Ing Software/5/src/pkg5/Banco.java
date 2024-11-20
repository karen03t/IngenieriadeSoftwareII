/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karen
 */
public class Banco {
   
    private List<Cuenta> cuentas = new ArrayList<>();

    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public boolean existeCuenta(String numero) {
        return cuentas.stream().anyMatch(cuenta -> cuenta.getNumero().equals(numero));
    }
    
}

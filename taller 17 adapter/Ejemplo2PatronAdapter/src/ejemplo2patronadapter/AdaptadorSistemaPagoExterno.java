/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2patronadapter;

/**
 *
 * @author juanm
 */
public class AdaptadorSistemaPagoExterno implements SistemaDePago{
    
    private SistemaPagoExterno sistemaPagoExterno;
    
    public AdaptadorSistemaPagoExterno (SistemaPagoExterno sistemaPagoExterno){
        this.sistemaPagoExterno = sistemaPagoExterno;
    }
    @Override
    public void procesarPago() {
        sistemaPagoExterno.autorizarTransaccion();
        sistemaPagoExterno.realizarPago();
    }
    
}

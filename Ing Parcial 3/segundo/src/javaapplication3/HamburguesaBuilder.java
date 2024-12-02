/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import javax.lang.model.SourceVersion;

/**
 *
 * @author hp
 */
public class HamburguesaBuilder {
    private final Hamburguesa hamburguesa;
    
    public HamburguesaBuilder() {
        hamburguesa = new Hamburguesa();
    }

    public HamburguesaBuilder tipoTomate(String tipoTomate) {
        hamburguesa.setTipoTomate(tipoTomate);
        return this;
    }

    public HamburguesaBuilder tipoCarne(String tipoCarne) {
        hamburguesa.setTipoCarne(tipoCarne);
        return this;
    }

    public HamburguesaBuilder tipoQueso(String tipoQueso) {
        hamburguesa.setTipoQueso(tipoQueso);
        return this;
    }

    public HamburguesaBuilder tipoPan(String tipoPan) {
        hamburguesa.setTipoPan(tipoPan);
        return this;
    }

    public Hamburguesa build() {
        return hamburguesa;
    }
}




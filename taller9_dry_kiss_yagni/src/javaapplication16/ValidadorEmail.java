package javaapplication16;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karen
 */
public class ValidadorEmail {
   public void validarEmail(String email) {
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Email inválido: " + email);
        } else {
            System.out.println("Email válido: " + email);
        }
    }
}

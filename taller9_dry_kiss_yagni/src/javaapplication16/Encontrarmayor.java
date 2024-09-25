/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

import java.util.Arrays;

/**
 *
 * @author karen
 */
public class Encontrarmayor {
    public static int encontrarMayor(int[] numeros) {
        return Arrays.stream(numeros).max().getAsInt();
    }
}

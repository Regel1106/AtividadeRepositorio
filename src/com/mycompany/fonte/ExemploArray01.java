/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fonte;

/**
 *
 * @author regel.7967
 */
public class ExemploArray01 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        
        System.err.println(numeros.length);
        
        int i = 0;
        while(i < 5){
        System.out.println("O numero " + numeros[i] + " esta no indice " + i);
        i++;
        
        }
    }
}

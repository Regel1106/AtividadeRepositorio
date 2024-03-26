/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fonte;

import java.util.Scanner;

/**
 *
 * @author regel.7967
 */
public class ExemploArray02 {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o  numero de quantidade de casas");
        num = s.nextInt();
        
        int[] numeros = new int[num];

        System.err.println(numeros.length);
        
        int i = 0;
        while(i < numeros.length){
            numeros[i] = i;
        System.out.println(numeros[i]);
        i++;
        
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exercicios.fonte;

import java.util.Scanner;

/**
 *
 * @author regel.7967
 */

//criação arquivo
public class Exercicio17 {
    
    //declaração do public void main
    public static void main(String[] args) {
        
        //criação de 3 variaveis do tipo float
        float peso,altura,imc;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        peso = s.nextFloat();
        System.out.println("Digite sua altura: ");
        altura = s.nextFloat();

        imc = peso / (altura*altura);
        System.out.println("IMC: " + imc);
    }
}


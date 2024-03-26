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

//criaçao do arquivo 
public class Exercicio10 {
    
    //Declaraçao do public void main 
    public static void main(String[] args) {
        
        //declaraçao de duas variaveis: celsius e fahrenheit
        float celsius, fahrenheit;
        
        //criaçao de uma variavel scanner
        Scanner s = new Scanner(System.in);
        
        //um print pedindo par digitar a temperatura em graus celsius
        System.out.println("Digite quantos Graus Celsius: ");
        
        //scanner vai guardar a resposta na variavel celsius
        celsius = s.nextFloat();
        
        //a variavel fahrenheit vai ser indentificada como float e vai receber a formula matematica da converçao de celcius para fahrenheit
        fahrenheit = (float) (celsius * 1.8)+ 32;
        
        //um print para falar a temperatura convertida para fahrenheit
        System.out.println("A temperatura em fahrenheit: "+ fahrenheit + "F");
        
    }//fechamento public void main
}//fechamento arquivo

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

//criação do arquivo
public class Exercicio01 {
    
    //declaração public void main
    public static void main(String[] args) {

        
        //criação de 3 variaveis tipo float
        float a, b, result;
        
        //criação de uma variavel de scanner
        Scanner s = new Scanner(System.in);

        //print vai pedir o primeiro numero
        System.out.println("Informe o Primeiro numero: ");
        
        //variavel a vai receber o primeiro numero
        a = s.nextFloat();
        
        //print vai pedir o segundo numero
        System.out.println("Informe o Segundo numero: ");
        
        //variavel b recebe segundo numero
        b = s.nextFloat();
        
        //resultado recebe variavel a + b
        result = a + b;
        
        //print escreve o resultado
        System.out.println("RESULTADO: " + result);
    }//fecha public void main
}//fecha arquivo
